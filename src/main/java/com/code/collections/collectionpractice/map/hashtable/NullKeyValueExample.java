package com.code.collections.collectionpractice.map.hashtable;

import java.util.Hashtable;

public class NullKeyValueExample {
    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>();

        // Exception: NullPointerException if you use null keys or values.
         table.put(null, "Apple");  // ❌ NullPointerException
         table.put(1, null);        // ❌ NullPointerException

        System.out.println("Hashtable: " + table);
    }
}
