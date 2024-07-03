package com.mruruc.list;

public interface List<T>{

    void pop();

    void remove(T data);

    void add(T data);

    void removeLast();

    void addFirst(T data);

    boolean isEmpty();

    int size();
}
