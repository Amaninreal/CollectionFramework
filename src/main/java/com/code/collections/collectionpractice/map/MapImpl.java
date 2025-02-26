package com.code.collections.collectionpractice.map;

import java.util.*;

public class MapImpl {
    public static void main(String[] args) {
        // adding a hashmap
        Map<String, Integer> newMap = new HashMap<>();


        // put method - adding key value pairs
        newMap.put("Aman", 3);
        newMap.put("Vikas", 1);
        newMap.put("Rakesh", 2);

        Map<Integer, String> hashMap = new HashMap<>();

        // doesn't allow duplicates
        hashMap.put(3, "C");
        hashMap.put(3, "C");
        hashMap.put(1, null);
        hashMap.put(4, "D");
        hashMap.put(2, "B");


        // accessing values
        System.out.println("Aman marks: " + newMap.get("Aman"));
        System.out.println("Vikas marks: " + newMap.get("Vikas"));

        // checking if key exists
        System.out.println("Bob have contains: " + newMap.containsKey("Aman"));

        // Iteration over values
        for(Integer newKey : newMap.values()){
            System.out.println("Marks: " + newKey);
        }

        // Iteration over keys
        for(String key : newMap.keySet()){
            System.out.println("Keys name as listed: " + key);
        }

        // Iterating over key - value pair
        for(Map.Entry<String, Integer> keyValue : newMap.entrySet()){
            System.out.println(keyValue.getKey() + " -> " + keyValue.getValue()) ;
        }

        newMap.remove("Aman", 1);

        for(Map.Entry<String, Integer> keyValue : newMap.entrySet()){
            System.out.println(keyValue.getKey() + " -> " + keyValue.getValue()) ;
        }

        // checking the order
        // Order is not preserved because HashMap arranges entries based on hash codes, not insertion order.
        for(Map.Entry<Integer, String> order : hashMap.entrySet()){
            System.out.println(order.getKey() + " -> " + order.getValue()) ;
        }

    }
}


/*
Type	Ordering	Null Keys	Performance
HashMap	No order	✅ 1 null key	Fast, O(1) for get()
LinkedHashMap	Insertion order	✅ 1 null key	Slightly slower than HashMap
TreeMap	Sorted order	❌ No null key	O(log n) due to sorting
Hashtable	No order	❌ No null key	Thread-safe but outdated
*/

/*
Method	                Description
put(K key, V value)	    Inserts or updates a key-value pair.
get(K key)	            Retrieves a value by key.
remove(K key)	        Removes a key-value pair.
containsKey(K key)	    Checks if a key exists.
containsValue(V value)	Checks if a value exists.
keySet()	            Returns a Set of keys.
values()	            Returns a Collection of values.
entrySet()	            Returns a Set of key-value pairs.

*/

/*
 When to Use Which Map?
    Use HashMap → When you need fast lookups and don’t care about order.
    Use LinkedHashMap → When insertion order must be maintained.
    Use TreeMap → When you need a sorted order based on keys.
    Use Hashtable → Only if thread-safety is needed (but prefer ConcurrentHashMap).
 */