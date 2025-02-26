package com.code.collections.collectionpractice.map.treemap;

import java.util.Map;
import java.util.TreeMap;

// Sorting Custom Objects (Comparable)
class Employees implements Comparable<Employees>{
    int id;
    String name;
    String email;

    public Employees(){};

    public Employees(int id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    public int compareTo(Employees e){
        return Integer.compare(this.id, e.id); // Sorting by employee ID
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + email;
    }
}

// Here I use comparable to sort
public class TreeComparable{
    public static void main(String[] args) {
        TreeMap<Employee, String> employeeMap = new TreeMap<>();

        employeeMap.put(new Employee(102, "Aman", "aman@gmail.com"), "CTO");
        employeeMap.put(new Employee(103, "Vikas", "vikas@gmail.com"), "HR");
        employeeMap.put(new Employee(101, "Tarun", "tarun@gmail.com"), "Head HR");

        System.out.println("Employee Sorted By ID: ");
        for(Map.Entry<Employee, String> entry : employeeMap.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
