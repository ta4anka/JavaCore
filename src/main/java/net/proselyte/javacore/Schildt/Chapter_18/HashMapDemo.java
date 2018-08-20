package net.proselyte.javacore.Schildt.Chapter_18;

import java.util.*;

class HashMapDemo {
    public static void main(String args[]) {
// Create a hash map.
        Map<String, Double> hm = new HashMap<>();
// Put elements to the map
        hm.put("John Doe", 3434.34);
        hm.put("Tom Smith", 123.22);
        hm.put("Jane Baker", 1378.00);
        hm.put("Tod Hall", 99.22);
        hm.put("Ralph Smith", -19.08);

// Get a set of the entries.
        Set<Map.Entry<String, Double>> set = hm.entrySet();

// Display the set.
        for(Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

// Deposit 1000 into John Doe's account.
        double balance = hm.get("John Doe");
        hm.put("John Doe", balance + 1000);
        System.out.println("John Doe's new balance: " + hm.get("John Doe"));
    }
}

/*
Tod Hall: 99.22
John Doe: 3434.34
Ralph Smith: -19.08
Tom Smith: 123.22
Jane Baker: 1378.0
John Doe's new balance: 4434.34
*/
