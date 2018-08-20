/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 */
public class CircularList <E> {
Node head;
Node tail;
//private int index = 0;
public CircularList() {
     head = null;
     tail = null;
}

public Node find(E v) {
    Node current = head;
    while(current.data != v) {
        current = current.next;
    }
    return current;
} // end find


public boolean isEmpty() { return (head == null); }

public void add(E v) {
    Node newNode = new Node(v);

    if(isEmpty())
        head = newNode;
        
    else
    {
        
        tail.next = newNode;
    }

    tail = newNode;  
    tail.next = head;
} // end insert


}  // end class
