package net.proselyte.javacore.mystudy.JavaPro.Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {
        int [] arr = new int[10];
        List<Integer> list = new ArrayList<>(10);
        fillArr(arr); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        fillList(list); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        //===========map method==================:
        arr = Arrays.stream(arr).map(a -> 5).toArray(); // [5, 5, 5, 5, 5, 5, 5, 5, 5, 5]
        list = list.stream().map(a -> 5).collect(Collectors.toList());// [5, 5, 5, 5, 5, 5, 5, 5, 5, 5]

        //==========filter method================:
        int [] arr2 = new int[10];
        List<Integer> list2 = new ArrayList<>();
        fillArr(arr2);
        fillList(list2);

        arr2 = Arrays.stream(arr2).filter(a -> a % 2 == 0).toArray(); // [2, 4, 6, 8, 10]
        list2 = list2.stream().filter(a -> a % 2 == 0).collect(Collectors.toList()); // [2, 4, 6, 8, 10]

        //==========forEach=====================
        Arrays.stream(arr2).forEach(System.out::println); // the same as forEach(a -> System.out.println(a));
        list2.forEach(System.out::println); // the same as .stream().forEach(a -> System.out.println(a));

        //==========reduce======================
        int [] arr3 = new int [10];
        List<Integer> list3 = new ArrayList<>();
        fillArr(arr3);
        fillList(list3);
        int sum1 = Arrays.stream(arr3).reduce((acc,b) -> acc + b).getAsInt();
        int product = list3.stream().reduce((acc,b) -> acc * b).get();
        //=======combination of methods================:
        int [] arr4 = new int[10];
        fillArr(arr4);
        int[] newArray = Arrays.stream(arr4).filter(a -> a % 2 != 0).map(a -> a * 2).toArray(); // [2, 6, 10, 14, 18]

    }
    //-------------just fill arr or list----------------------
    private static void fillArr(int[] arr) {
        for(int i = 0; i< 10; i++)
            arr[i] = i + 1;
    }

    private static void fillList(List<Integer> list) {
        for(int i = 1; i < 11; i++)
            list.add(i);
    }
    //--------------------------------------------------------
}
