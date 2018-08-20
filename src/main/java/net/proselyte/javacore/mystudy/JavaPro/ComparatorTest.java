package net.proselyte.javacore.mystudy.JavaPro;

import java.util.*;

import static java.util.Arrays.asList;

public class ComparatorTest {
    public static void main(String[] args) {

        List<String> animals = new ArrayList<>(asList("dog","cat","butterfly","bird","frog","pig"));
       Collections.sort(animals,new StringLengthComparator());
        System.out.println(animals); // [dog, cat, pig, bird, frog, butterfly]


        List<Integer> list = new ArrayList<>(asList(4, 8, 15, 16, 23, 42,-9,0));

        // 2) Create Comparator by using anonymous Comparator's class:
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                if(integer < t1) return 1;
                else if(integer > t1) return -1;
                else return 0;
            }
        });
        System.out.println(list);  // [42, 23, 16, 15, 8, 4, 0, -9]
    }
}


    //1) Create Comparator by using our Comparator's class:
class StringLengthComparator implements Comparator<String>{
    @Override
    public int compare(String s, String t1) {
        if(s.length() > t1.length()) return 1;
        else if(s.length() < t1.length()) return -1;
        else return 0;
    }
}

