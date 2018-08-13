package net.proselyte.javacore.Schildt.Chapter_18;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> al = new ArrayList<String>();
        System.out.println("Initial size of al: " + al.size());

        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1,"A2");

        System.out.println("Size of al after additions: " + al.size());

        //Display the array list.
        System.out.println("Contents of al: " + al);

        //Remove elements from the array list.
        al.remove("F");
        al.remove(2);

        System.out.println("Size of al after deletions: " + al.size());
        System.out.println("Contents of al: " + al);
        }
}

/*    Initial size of al: 0
      Size of al after additions: 7
      Contents of al: [C, A2, A, E, B, D, F]
      Size of al after deletions: 5
      Contents of al: [C, A2, E, B, D]
*/



