/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 */
public class MyArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList x = new ArrayList(12);
        x.add(0, "Mercury");
        x.add(1, "Venus");
        x.add(2, "Earth");
        x.add(3, "Mars");
        x.add(4, "Neptune");
        x.add(5, "Saturn");
        x.add(6, "Jupiter");
        x.add(7, "Pluto");
        
        System.out.println(x.get(2));//task a
        System.out.println(x.elementCount);
        x.set(2, "X");//task b
        System.out.println(x.get(2));
        System.out.println(x.elementCount);
        x.remove(2);//task c
        System.out.println(x.elementCount);
        x.add(2, "New Earth");//task d
        System.out.println(x.get(2));
        System.out.println(x.elementCount);
        System.out.println(x.indexOf("Neptune"));//task d2
        // ADD YOUR CODE here for Task1
    }
    
}
