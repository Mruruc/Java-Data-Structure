package Java_Collections;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList {
    public static void main(String[] args) {

        //ArrayList in java is a resizeable array that can grow or shrink in the memory whenever needed;
        // it has also known as a dynamic array.
        //to handle all the limitations of arrays,we can use the arrayList.
        //ArrayList allows storing heterogeneous objects(which mean can store element of different type).

        //because of implements of the list interface, it has all methods that list has;

        //methods that list does not have:
        //ensureCapacity()--->>increase the capacity of arraylist,if necessary,
        // to ensure that it can hold at least the number of elements specified by the minimum capacity argument;
        ArrayList<Double> arrayList=new ArrayList<>(2);
        arrayList.add(0.1);
        arrayList.add(6.3);
        System.out.println(arrayList);
        arrayList.ensureCapacity(3);

        //trimTpSize()--->> reduces the capacity of the arrayList to current size;
        arrayList.trimToSize();
    }
}
