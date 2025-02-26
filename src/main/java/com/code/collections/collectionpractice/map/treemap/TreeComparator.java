package com.code.collections.collectionpractice.map.treemap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

class Employee {
    int id;
    String name;
    String email;

    public Employee(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee {" +
                "id= " + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

// Comparator for sorting by name
class NameComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee e1, Employee e2){
        return e1.name.compareTo(e2.name);
    }
}

public class TreeComparator {
    public static void main(String[] args) {
        TreeMap<Employee, String> employeeMap = new TreeMap<>(new NameComparator());

        employeeMap.put(new Employee(102, "Aman", "aman@gmail.com"), "CTO");
        employeeMap.put(new Employee(101, "Vijay", "vijay@gmail.com"), "HR");
        employeeMap.put(new Employee(100, "Raks", "raks@gmail.com"), "Head");

        System.out.println("Employee sorted by name: ");
        for (Map.Entry<Employee, String> entry: employeeMap.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
/*
When to Use What?
    Use Comparable when natural ordering is required (e.g., sorting Employees by ID).
    Use Comparator when you need multiple sorting criteria (e.g., sorting Employees by name, age, or department).
 */
