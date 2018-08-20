package net.proselyte.javacore.mystudy.JavaPro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;

public class findMaxAndMin {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(asList(4, 8, 15, 16, 23, 42,-9,0));
        System.out.println("Max is "+ Collections.max(list)); //
        System.out.println("Min is "+ Collections.min(list));
    }
}
