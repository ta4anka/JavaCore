package net.proselyte.javacore.mystudy.JavaPro;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetTest {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        hashSet.add("Zuko");
        hashSet.add("Mike");
        hashSet.add("Tom");
        hashSet.add("Mike");
        hashSet.add("Bob");
        hashSet.add("Donald");

        for (String name : hashSet){
            System.out.print(name + " "); //Mike Tom Bob Zuko Donald
        }
    }




}
