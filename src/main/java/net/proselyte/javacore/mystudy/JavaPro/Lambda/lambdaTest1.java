package net.proselyte.javacore.mystudy.JavaPro.Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntPredicate;

public class lambdaTest1 {
    public static void main(String[] args) {
        List<Integer> list  = new ArrayList<>();
        IntPredicate bInt = (x)-> x % 2 == 0;

        int [] arr = {1,2,3,4,5,6,7,8,9,10,11,12};
        for(int a: arr){
            if(bInt.test(a)){
                list.add(a);
            }
        }
        System.out.println(list); // [2, 4, 6, 8, 10, 12]
    }
}

