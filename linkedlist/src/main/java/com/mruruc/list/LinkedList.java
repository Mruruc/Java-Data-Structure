package com.mruruc.list;

public class LinkedList<T> implements List<T>{
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public LinkedList() {
    }

    @Override
    public void pop() {
        if (head == null) throw new IllegalStateException("List is empty!");
        head = head.reference;
        size--;
        if (head == null) {
            tail = null;
        }
    }

    @Override
    public void remove(T data) {
        if (this.size() == 0) throw new IllegalStateException("List is empty!");

        Node<T> cursor = head;

        if (cursor.data.equals(data)) {
            this.pop();
            return;
        }

        while (cursor.reference != null) {
            if (cursor.reference.data.equals(data)) {
                cursor.reference = cursor.reference.reference;
                size--;
                if (cursor.reference == null) tail = cursor;
                return;
            }
            cursor = cursor.reference;
        }
        throw new IllegalArgumentException("Data Not Found!");
    }

    @Override
    public void add(T data) {
        if (head == null) {
            this.addFirst(data);
            return;
        }
        Node<T> node = new Node<>(data);
        tail.reference = node;
        tail = node;
        size++;
    }

    @Override
    public void removeLast() {
        if (this.size() == 0) throw new IllegalStateException("List is empty!");

        if (this.size() == 1) {
            head = null;
            tail = null;
        } else {
            Node<T> cursor = head;
            while (cursor.reference != tail) {
                cursor = cursor.reference;
            }
            cursor.reference = null;
            tail = cursor;
        }
        size++;
    }

    @Override
    public void addFirst(T data) {
        Node<T> newNode = new Node<T>(data);
        if (head == null) {
            this.head = newNode;
            this.tail = newNode;
            size++;
            return;
        }
        newNode.reference = head;
        head = newNode;
        size++;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }


    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        Node<T> cursor = head;

        while (cursor != null) {
            str.append(cursor.data).append(", ");
            cursor = cursor.reference;
        }

        return "LinkedList:{" +
                str.toString() +
                '}';
    }

    private static class Node<T> {
        private T data;
        private Node<T> reference;

        Node(T data) {
            this.data = data;
            this.reference = null;
        }
    }
}
