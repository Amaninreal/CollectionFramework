package com.code.collections.collectionpractice.map.hashtable;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListMap;

public class MultiThreadHashtable {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> table = new ConcurrentHashMap<>();

        // Adding values using multiple threads
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                table.put(i, "Value " + i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 6; i <= 10; i++) {
                table.put(i, "Value " + i);
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Hashtable: " + table);
    }
}


/*
public class MultiThreadHashtable {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> concurrentMap = new ConcurrentHashMap<>();

        // Adding values using multiple threads
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                concurrentMap.put(i, "Value " + i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 6; i <= 10; i++) {
                concurrentMap.put(i, "Value " + i);
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final ConcurrentHashMap: " + concurrentMap);
    }
}
*/

/*
✅ Use ConcurrentHashMap instead of Hashtable for better concurrency and performance.
✅ If ordering is important, use a ConcurrentSkipListMap instead.
Would you like to try that too? 🚀
 */