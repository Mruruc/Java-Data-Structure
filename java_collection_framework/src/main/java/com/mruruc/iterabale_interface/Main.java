package com.mruruc.iterabale_interface;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // The root of collection framework is Iterable interface.
        // it provides iterator to iterate through the all collections(List,Queue,Set);
        List<String> fruit = new ArrayList<>();
        fruit.add("Melon");
        fruit.add("Apple");
        fruit.add("Banana");
        fruit.add("Cherry");

//        hasNext() method is a method of iterator interface returns true if there are elements to be iterated over,otherwise false;
//        next() method is a method of iterator interface return the next element in the iteration,
//         otherwise it throws a NoSuchElementException;

        Iterator<String> iterator = fruit.iterator();
        System.out.println(iterator.hasNext());

        do {
            System.out.println(iterator.next());
        } while (iterator.hasNext());


    }
}
