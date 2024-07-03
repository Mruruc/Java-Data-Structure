package Java_Collections;

import java.util.LinkedList;

public class MyLinkedList {
    public static void main(String[] args) {

        //LinkedList class uses Doubly linked list data structure to store the element:
        //It inherits from AbstractList class and implements List and Deque interface;
        //The important point of LinkedList are:
        //1) it can contain duplicate elements.
        //2) maintains insertion order.
        //3) is non Synchronized.
        //4) manipulation is fast because no shifting needs to occur.
        //(insertion,removel and access element)
        //5) can be used as a list, stack or queue.

        //Constructor;
        //LinkedList list= new LinkedList();
        // LinkedList list2=new LinkedList(Collection);

        //Methods;
        //LinkedList Class has all methods of collection,List and Deque interface due to implements them;
        //its own methods;

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(3);
        linkedList.add(6);
        linkedList.add(2);
        linkedList.add(1);
        System.out.println(linkedList);

        //getFirs()---->>Retrieves head element, if the list is empty,throws NoSuchElementException;
        System.out.println(linkedList.getFirst());

        //getLast()----->>Retrieves the tail element, if the list is empty,throws NoSuchElementException;
        System.out.println(linkedList.getLast());

        //removeFirst()------->> removes the head of the list and return the first element;
        System.out.println(linkedList.removeFirst());

        //removeLast()------->> removes the tail of the list and returns the last element,
        // if the list is empty,throws NoSuchElementException;
        System.out.println(linkedList.removeLast());

        //addFirst()---->> adds element to head.
        linkedList.addFirst(5);

        //addLast()----->> adds element to tail.
        linkedList.addLast(5);

        System.out.println(linkedList);
    }
}
