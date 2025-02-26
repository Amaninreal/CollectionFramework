package com.code.collections.collectionpractice.map.hashtable;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {
    public static void main(String[] args) {
        // Creating a Hashtable
        Map<Integer, String> table = new Hashtable<>();

        // Adding key-value pairs
        table.put(1, "Aman");
        table.put(2, "vikas");
        table.put(4, "man");

        System.out.println(table);

    }
}

/*
Hashtable<K, V> is a part of Java's Collection Framework and implements the Map interface.
It stores key-value pairs in a hash table data structure and is similar to HashMap, but with key differences.

✅ Thread-Safe & Synchronized – Suitable for multi-threaded environments.
✅ No null Keys or Values – Unlike HashMap, it does not allow null keys or values.
✅ Unordered Data Storage – Entries are not maintained in any particular order.
✅ Uses Hashing Mechanism – Similar to HashMap, but is synchronized.
✅ Slower Performance – Due to synchronization overhead, Hashtable is slower than HashMap.
*/

/*
Feature	        Hashtable	            HashMap	       ConcurrentHashMap
Thread-Safety	✅ Yes (Synchronized)	❌ No	        ✅ Yes (Better Performance)
Null Keys?	    ❌ No	                ✅ Yes	        ❌ No
Null Values?	❌ No	                ✅ Yes	        ❌ No
Performance	    Slower(Full Synchronization) Faster     Faster (Partial Locking)
Order of Elements ❌ No Order	        ❌ No Order	    ❌ No Order
Use Case	    Multi-threaded (Old)	Single-threaded	Modern Multi-threading
 */