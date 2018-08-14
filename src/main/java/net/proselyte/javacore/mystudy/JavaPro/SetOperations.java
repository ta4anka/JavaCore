package net.proselyte.javacore.mystudy.JavaPro;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        for(int i = 0; i < 6;i++)
            set1.add(i);

        Set<Integer> set2 = new HashSet<>();
        for(int i = 2; i < 8; i++)
            set2.add(i);

        System.out.println(set1); //[0, 1, 2, 3, 4, 5]
        System.out.println(set2); //[2, 3, 4, 5, 6, 7]

        //------------Union----------------
        Set <Integer> union = new HashSet<>(set1); // This set has the same elements from the set1

        union.addAll(set2);
        System.out.println(union);  // [0, 1, 2, 3, 4, 5, 6, 7]

        //----------Intersection-----------
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println(intersection); // [2, 3, 4, 5]

        //-----------Difference------------
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println(difference); // [0, 1]




    }
}
