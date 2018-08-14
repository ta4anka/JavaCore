package net.proselyte.javacore.mystudy.JavaPro;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ThreeTypesOfMap {
    public static void main(String[] args) {
        Map<Integer,String> hashMap = new HashMap<>();
        Map<Integer,String> linkedHashMap = new LinkedHashMap<>();
        Map<Integer,String> treeMap = new TreeMap<>();

        testMap(hashMap);
        testMap(linkedHashMap);
        testMap(treeMap);
        }

    public static void testMap(Map<Integer,String> map) {
        map.put(39,"Bob");
        map.put(15,"Ted Mosby");
        map.put(23,"Dilan");
        map.put(12490,"Elen");
        map.put(0,"Lewis");
        map.put(2,"Dilan");

        for(Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("=========================");

    }
}

/*
        0 : Lewis
        2 : Dilan
        39 : Bob
        23 : Dilan
        12490 : Elen
        15 : Ted Mosby
        =========================
        39 : Bob
        15 : Ted Mosby
        23 : Dilan
        12490 : Elen
        0 : Lewis
        2 : Dilan
        =========================
        0 : Lewis
        2 : Dilan
        15 : Ted Mosby
        23 : Dilan
        39 : Bob
        12490 : Elen
        =========================*/
