package com.mruruc.list;

import java.util.NoSuchElementException;

public class DoublyLinkedList<T> implements List<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public DoublyLinkedList() {
    }

    @Override
    public void add(T data) {
        if (head == null) {
            this.addFirst(data);
        } else {
            Node<T> node = new Node<>(data);
            tail.next = node;
            node.prev = tail;
            tail = node;
            size++;
        }
    }

    @Override
    public void addFirst(T data) {
        Node<T> node = new Node<>(data);
        if (head == null) {
            this.head = node;
            this.tail = node;
        } else {
            head.prev = node;
            node.next = head;
            head = node;
        }
        this.size++;
    }

    @Override
    public void pop() {
        if (this.size() == 0) throw new IllegalStateException("List is empty!");
        if (this.size() == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            if (head != null) head.prev = null;
        }
        size--;

    }

    @Override
    public void remove(T data) {
        if (this.size() == 0) {
            throw new IllegalStateException("List is empty!");
        }
        Node<T> cursor = head;

        while (cursor != null) {
            if (cursor.data.equals(data)) {
                if (cursor == head) {
                    // Removing the head node
                    head = cursor.next;
                    if (head != null) {
                        head.prev = null;
                    } else {
                        // The list is now empty
                        tail = null;
                    }
                } else if (cursor == tail) {
                    // Removing the tail node
                    tail = cursor.prev;
                    if (tail != null) tail.next = null;

                } else {
                    // Removing a node in the middle
                    cursor.prev.next = cursor.next;
                    cursor.next.prev = cursor.prev;
                }
                this.size--;
                return;
            }
            cursor = cursor.next;
        }

        throw new NoSuchElementException("Element Not Found!");
    }


    @Override
    public void removeLast() {
        if (this.size() == 0) throw new IllegalStateException("List is empty!");
        if (this.size() == 1) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        this.size--;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        Node<T> cursor = head;
        while (cursor != null) {
            builder.append(cursor.data).append(", ");
            cursor = cursor.next;
        }
        return "DoublyLinkedList:{" + builder.toString() + '}';
    }

    private static class Node<T> {
        private T data;
        private Node<T> next;
        private Node<T> prev;


        Node(T data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
}
