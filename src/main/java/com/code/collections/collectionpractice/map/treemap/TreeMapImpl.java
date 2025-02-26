package com.code.collections.collectionpractice.map.treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapImpl {
    public static void main(String[] args) {
        Map<Integer, String> treeMap = new TreeMap<>();

        // Keys are automatically sorted in ascending order.
        treeMap.put(1, "Vikas");
        treeMap.put(4, "Rakesh");
        treeMap.put(3, "kas");
//      value null allowed here
        treeMap.put(2, null);
        // null keys are not allowed here
        // treeMap.put(null, "1");

        System.out.println(treeMap);

    }
}
