package net.proselyte.javacore.Schildt.Chapter_18;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");
        ll.addLast("Z");
        ll.addFirst("A");

        ll.add(1,"A2");

        System.out.println("Original contents of 11: " + ll);

        //Remove elements from the linked list.
        ll.remove("F");
        ll.remove(2);

        System.out.println("Contents of ll after deletion: " + ll);

        //Remove first and last elements.
        ll.removeFirst();
        ll.removeLast();

        System.out.println("ll after deleting first and last: " + ll);

        //Get and set a value.

        String val = ll.get(2);
        ll.set(2, val + " Changed");

        System.out.println("ll after change: " + ll);

    }
}
/*

    Original contents of 11: [A, A2, F, B, D, E, C, Z]
    Contents of ll after deletion: [A, A2, D, E, C, Z]
    ll after deleting first and last: [A2, D, E, C]
    ll after change: [A2, D, E Changed, C]
*/
