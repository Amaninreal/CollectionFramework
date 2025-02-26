package com.code.collections.collectionpractice.map.treemap;


import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

// By default, TreeMap sorts keys in natural order.
//To define custom sorting, we use a Comparator.
public class TreeCompratorImpl {
    public static void main(String[] args) {
        Map<Integer,String> treeMap = new TreeMap<>(Collections.reverseOrder());
        // Keys are automatically sorted in ascending order.
        // but due to comparator now order in descending
        treeMap.put(4, "Rakesh");
        treeMap.put(1, "Aman");
        treeMap.put(3, "kas");

        System.out.println("TreeMap (Descending Order): " + treeMap);
    }
}
