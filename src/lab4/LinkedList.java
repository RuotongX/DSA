package lab4;

public class LinkedList {
	public static void main(String[] args) {
		CircularList cl = new CircularList();
		cl.add("Life");
		cl.add("On");
		cl.add("Mars");
		System.out.println(cl.head.data);
		System.out.println(cl.head.next.data);
		System.out.println(cl.tail.data);
		System.out.println(cl.tail.next.data);
	}
}
