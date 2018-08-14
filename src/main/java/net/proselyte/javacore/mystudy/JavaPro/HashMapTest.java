package net.proselyte.javacore.mystudy.JavaPro;

import java.util.HashMap;
import java.util.Map;
//HashMap in Java = dic in python

public class HashMapTest {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1,"One");
        map.put(2,"Two");
        map.put(3,"Three");
        System.out.println(map); //{1=One, 2=Two, 3=Three}

        for(Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
/*
1 : One
2 : Two
3 : Three
*/
