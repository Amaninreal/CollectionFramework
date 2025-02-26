package com.code.collections.collectionpractice.map.hashtable;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashtableIterations {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(10, "aman");
        hashtable.put(5, "rakesh");
        hashtable.put(1, "uk");

        // Iterate Using Enumeration
        Enumeration<Integer> keys = hashtable.keys();
        while(keys.hasMoreElements()){
            Integer key = keys.nextElement();
            System.out.println(key + " -> " + hashtable.get(key));
        }

        // Iterating using Iterators
        Iterator<Map.Entry<Integer, String>> iterator = hashtable.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }


    }
}

/*
🛠️ 8️⃣ Important Methods of Hashtable
Method	Description
put(K key, V value)	Adds a key-value pair.
get(K key)	Retrieves value for a key.
remove(K key)	Removes a key-value pair.
containsKey(K key)	Checks if key exists.
containsValue(V value)	Checks if value exists.
isEmpty()	Returns true if empty.
size()	Returns the number of elements.
keys()	Returns an Enumeration of keys.
elements()	Returns an Enumeration of values.
clone()	Creates a shallow copy of the Hashtable.
 */