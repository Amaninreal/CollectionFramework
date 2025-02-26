package com.code.collections.collectionpractice.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapImpl {
    public static void main(String[] args) {
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

        // It maintains order - they all are added in same order
        linkedHashMap.put(103, "Aman");
        linkedHashMap.put(101, "Rakesh");
        linkedHashMap.put(102, "Vikas");

        for(Map.Entry<Integer, String> keyValue : linkedHashMap.entrySet()){
            System.out.println(keyValue.getKey() + " --> " + keyValue.getValue());
        }

        System.out.println(linkedHashMap.get(102));
        System.out.println(linkedHashMap.containsKey(102));




    }

}
