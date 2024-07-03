package com.mruruc.dictionaries;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

//        HashMap<String, Double> gpaToStudent = new HashMap<>();
//        gpaToStudent.put("Alice", 4.0);
//        gpaToStudent.put("Bob", 3.9);
//        gpaToStudent.put("Charlie", 3.8);
//        gpaToStudent.put("Marry", 4.5);

//        System.out.println(gpaToStudent);

//        // iterating over keys:
//        for (String name : gpaToStudent.keySet()) {
//            System.out.println(name);
//        }

        // iterating over values
//        Double highestGpa = 0.0;
//        for(Double gpa: gpaToStudent.values()){
//            if (gpa > highestGpa) highestGpa = gpa;
//        }
//        System.out.println(highestGpa);

        // Iterating over key-value pairs
//        for (Map.Entry<String, Double> entry: gpaToStudent.entrySet()){
//            System.out.println(entry.getKey() +"--->"+entry.getValue());
//        }

//        System.out.println(gpaToStudent);
//        System.out.println( gpaToStudent.remove("Marry"));
//        System.out.println(gpaToStudent);

        TreeMap<String, Double> gpaToStudent = new TreeMap<>();
        gpaToStudent.put("Alice", 4.0);
        gpaToStudent.put("John",5.0);
        gpaToStudent.put("Bob", 3.9);
        gpaToStudent.put("Charlie", 3.8);
        gpaToStudent.put("Marry", 4.5);

        System.out.println(gpaToStudent);

        var sumOfGpa= 0.0;
        gpaToStudent.forEach((key,value)->{
            System.out.println(key + " " + value);
        });


    }
}
