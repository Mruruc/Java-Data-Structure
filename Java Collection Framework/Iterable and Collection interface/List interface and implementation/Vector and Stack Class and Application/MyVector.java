package Java_Collections;

import java.util.Vector;

public class MyVector {

    public static void main(String[] args) {


        //Vector is like the dynamic array which can grow or shrink its size.
        //We can store n-number of elements in it (there is no size limit).
        //it is a part of java collection framework,and implements list interface.

        //it is recommended to use the vector class in the thread-safe implementation only.
        //if we do not need use thread-safe implementation,we should use arraylist.it will perform better;

        //it is similar to the ArrayList but with two difference:
        //1) Vector is synchronized.
        //2) Vector class is a legacy class and has many legacy methods.

        //Enumeration--->>The vector class provides an Enumeration interface,
        // which allows us to iterate over the elements in the vector.

        //The Vector class implements list interface and collection interface
        // ,so it has access all methods of list and collection interface.

                       //Methods:

        Vector<Integer>vector=new Vector<>();

        vector.add(3);
        vector.add(7);
        vector.addElement(9);
        vector.add(4);
        System.out.println(vector);

        System.out.println("The capacity of vector: "+vector.capacity());

        Vector<Integer>vector2=new Vector<>();

        vector2= (Vector<Integer>) vector.clone();
        System.out.println(vector2);

        System.out.println(vector2.elementAt(3));
        System.out.println(vector2.firstElement());
        System.out.println(vector2.lastElement());
        vector2.setSize(5);
        System.out.println(vector2);
        vector2.insertElementAt(22,4);
        System.out.println(vector2);
        System.out.println(vector2.get(3));
    }
}
