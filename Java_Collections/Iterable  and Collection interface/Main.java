package Java_Collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // The root of collection framework is Iterable interface;
        //it provides iterator to iterate through the all collections(List,Queue,Set);
        List<String> fruit = new ArrayList<>();
        fruit.add("Melon");
        fruit.add("Apple");
        fruit.add("Banana");
        fruit.add("Cherry");

        //hasnext() method is a method of iterator interface returns true if there are elements to be iterated over,otherwise false;

        //next() method is a method of iterator interface return the next element in the iteration,
        // otherwise it throws a NoSuchElementException;

        Iterator<String> iterator = fruit.iterator();
        System.out.println(iterator.hasNext()); //it returns true.
        System.out.println(iterator.next()); // it returns first element,and so on.
        System.out.println();
        while (iterator.hasNext()) {
            System.out.print("--->" + iterator.next());
        }
        System.out.println();


        //Collection interface is inherited from iterable interface,
        // it defines a group of objects that can be treated as a single unit.
        //Methods:
        Collection<Double> number = new HashSet<>();
        //add() --->>> help us to add element into list;
        number.add(2.1);
        number.add(1.9);
        number.add(0.1);
        number.add(0.9);
        System.out.println(number);

        //size()--->> help us to fid number of element in collection;
        int size = number.size();
        System.out.println("The size of collection: " + size);

        //isEmpty()---> help us to check that collection is empty or no, if is empty --->true otherwise false;
        boolean isempty = number.isEmpty();
        System.out.println(isempty);

        //contains() ---> help us to check tha our collection contains an element or no;
        boolean check = number.contains(0.9);
        System.out.println("The elements is in collection: " + check);

        System.out.println("The elements is in collection: " + number.contains(0.5));

        //toArray() --->> help us to put our collection elements into array;
        //toArray(Object[] a)--->>help us to put our collection elements into array, but we must specify type of array;
        Object[] arr = number.toArray();
        System.out.println(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        Double[] arr2 = number.toArray(new Double[0]);
        System.out.println(arr2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        //containsAll(Collection c)----->> help us to find a collection that
        // contain all the elements other collection or no;

        Collection<Double> list3 = new HashSet<>();
        number.add(2.1);
        number.add(1.9);
        number.add(0.1);
        number.add(0.9);
        number.add(3.8);

        boolean conatainsAll = list3.containsAll(number);
        System.out.println(conatainsAll);

        //addAll()--->> it help us to put an element of a collection to current collection;
        boolean check2 = list3.addAll(number);
        System.out.println(check2);
        System.out.println(list3);

        //removeAll()--->> help us to remove all elements of a collection and put in to another collection;
        list3.add(0.0001);
        boolean boool = list3.removeAll(number);
        System.out.println(boool);
        System.out.println(list3);
        System.out.println(number);

        //retainAll()--->> help us to remove all elements from current collection that
        // are not contained in the specified collection;
        System.out.println(list3.retainAll(number));
        System.out.println(list3);

        //clear()--->> remove all elements from the collection;
        number.clear();
        System.out.println(number);


    }
}
