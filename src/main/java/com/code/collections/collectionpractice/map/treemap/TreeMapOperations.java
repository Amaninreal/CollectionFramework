package com.code.collections.collectionpractice.map.treemap;

import java.util.TreeMap;

public class TreeMapOperations {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(10, "rak");
        map.put(5, "qak");
        map.put(1, "amank");
        map.put(6, "yakkk");

        System.out.println("First Key: " + map.firstKey());
        System.out.println("First Key: " + map.pollFirstEntry());
        System.out.println("First Key: " + map.pollLastEntry());
        System.out.println("Last Key: " + map.lastKey());
        System.out.println("Higher than 6: " + map.higherKey(6));
        System.out.println("Lower than 20: " + map.lowerKey(20));
    }
}

/*
✔ TreeMap maintains key-value pairs in sorted order of keys.
✔ Uses a Red-Black Tree for O(log n) performance.
✔ Does not allow null keys, but allows null values.
✔ Best for sorted data storage, range queries, and navigation.
 */