package com.code.collections.collectionpractice.map.hashtable;

import java.util.Hashtable;
import java.util.Map;

public class HashTableOperations {
    public static void main(String[] args) {
        Hashtable<Integer, String> operations = new Hashtable<>();
        operations.put(2, "Aman");
        operations.put(1, "Vikas");
        operations.put(3, "Rakesh");
        operations.put(5, "Suresh");
        operations.put(4, "Mahesh");
        operations.put(6, "Kishan");
        operations.put(7, "Rohan");
        operations.clear();
        operations.put(70, "X");
        operations.put(20, "Y");
        operations.put(30, "Z");
        System.out.println(operations);

        System.out.println(operations);
        for(Map.Entry<Integer, String> key : operations.entrySet()){
            System.out.println(key.getKey() + " " + key.getValue());
        }
    }
}
