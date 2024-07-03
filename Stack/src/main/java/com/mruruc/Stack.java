package com.mruruc;

public class Stack<T> {
    private T[] array;
    private final int DEFAULT_SIZE = 10;
    private int counter;


    public Stack(int size) {
        this.array = (T[]) new Object[size];
        this.counter = 0;
    }

    public Stack() {
        this.array = (T[]) new Object[DEFAULT_SIZE];
        this.counter = 0;
    }

    public void push(T data) {
        if (isFull()) this.resize();
        array[counter] = data;
        counter++;
    }

    private void resize() {
        T[] temp = (T[]) new Object[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }

    public T pop() {
        if (isEmpty()) throw new IllegalStateException("Stack is Empty! :)");
        counter--;
        T poppedElement = array[counter];
        array[counter] = null;
        return poppedElement;
    }

    public T peek() {
        if (isEmpty()) throw new IllegalStateException("Stack is Empty! :)");
        return array[counter - 1];
    }

    public boolean isEmpty() {
        return counter == 0;
    }

    public boolean isFull() {
        return counter == array.length;
    }

    public T get(int index) {
        return array[index];
    }

    public int size() {
        return this.counter;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < counter; i++) {
            builder.append(array[i]).append(", ");
        }
        return "Stack[" + builder.toString() + "]";
    }
}
