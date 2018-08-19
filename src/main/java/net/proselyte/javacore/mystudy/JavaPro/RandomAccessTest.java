package net.proselyte.javacore.mystudy.JavaPro;

import java.util.*;
//
public class RandomAccessTest {
    public static void main(String[] args) {
        Collection<Integer> list1 = new LinkedList<>();
        Collection<Integer> list2 = new ArrayList<>();
        Collection<Integer> list3 = new Vector<>();
        Collection<Integer> list4 = new Stack<>();
        Collection<Integer> set = new HashSet<>();

        System.out.println(checkRandomAccess(list1)); //false
        System.out.println(checkRandomAccess(list2)); // true
        System.out.println(checkRandomAccess(list3)); //true
        System.out.println(checkRandomAccess(list4)); //true
        System.out.println(checkRandomAccess(set)); //false
    }

    private static boolean checkRandomAccess(Collection<Integer> obj){
        return obj instanceof RandomAccess;
    }
}
