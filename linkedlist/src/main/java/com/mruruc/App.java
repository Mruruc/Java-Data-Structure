package com.mruruc;


import com.mruruc.list.DoublyLinkedList;
import com.mruruc.list.List;

public class App {
    public static void main(String[] args) {

        List<String> list = new DoublyLinkedList<>();
        list.addFirst("John");
        list.addFirst("Jane");
        list.add("Bob");
        list.add("Marry");
        System.out.println("Size: " + list.size());
        list.remove("Marry");
        System.out.println("Size: " + list.size());
        System.out.println(list);

    }
}
