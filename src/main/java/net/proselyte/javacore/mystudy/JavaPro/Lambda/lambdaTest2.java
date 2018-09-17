package net.proselyte.javacore.mystudy.JavaPro.Lambda;

// my own functional interface:

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface BiIntPredicate{
    boolean test(int x, int y);
}

public class lambdaTest2 {
    public static void main(String[] args) {
        List<Integer> list  = new ArrayList<>();

        BiIntPredicate biIntPredicate = (x,y) -> (x + y) % 2 == 0;

        int [] arr = new int[10];
        int [] arr2 = new int[10];
        //adding a random number to arrays:
        for (int i = 0;i<arr2.length;i++){
            arr[i] = (int) (Math.random()*10);
            arr2[i] = (int) (Math.random()*10);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        for(int i = 0;i<arr.length;i++ ){
            int a = arr[i];
            int b = arr2[i];
            if(biIntPredicate.test(a,b)){
                list.add(a);
            }
        }
        System.out.println(list);
    }

}
