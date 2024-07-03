package com.mruruc.collection_interface;

import java.util.Collection;
import java.util.HashSet;

public class UnderstandingCollectionInterface {
    public static void main(String[] args) {

        // Collection interface is inherited from iterable interface,
        // it defines a group of objects that can be treated as a single unit.
        //Methods:
        Collection<Double> numbers = new HashSet<>();
        //add() --->>> help us to add element into list;
        numbers.add(2.1);
        numbers.add(1.9);
        numbers.add(0.1);
        numbers.add(0.9);

//        //size()--->> returns numbers of element in collection;
//        int size = numbers.size();
//        System.out.println("The size of collection: " + size);
//
//        //isEmpty()---> returns if is empty --->true otherwise false;
//        boolean isCollectionEmpty = numbers.isEmpty();
//        System.out.println(isCollectionEmpty);
//
//        //contains() ---> help us to check tha our collection contains an element or no;
//        boolean check = numbers.contains(0.9);
//        System.out.println("The elements is in collection: " + check);


        //toArray() --->> help us to put our collection elements into array;
        // toArray(Object[] a)--->>help us to put our collection elements into array, but we must specify type of array;
//        Object[] arr = numbers.toArray();



        //containsAll(Collection c)----->> helps us find a collection that contain all the elements other collection or no;
        //addAll()--->> it help us to put an element of a collection to current collection;
        //removeAll()--->> help us to remove all elements of a collection and put in to another collection;
        //retainAll()--->> help us to remove all elements from current collection that
        // are not contained in the specified collection;
        //clear()--->> remove all elements from the collection;


    }
}

