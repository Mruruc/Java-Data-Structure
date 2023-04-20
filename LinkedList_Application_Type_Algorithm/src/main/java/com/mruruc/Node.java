package com.mruruc;

public class Node<T extends Comparable<T>> {
     public Node next;
     protected Node prev;
     public T data;

    public Node(T data) {
        this.data = data;
        this.next = null;
        this.prev=null;
    }
}
