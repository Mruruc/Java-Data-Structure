package com.mruruc.Queue_With_Array;

import java.util.Arrays;

public class SimpleQueue {
    private int[] arr;
    private int rear;
    private final int Default_size=10;

    public SimpleQueue(){
        this.arr=new int[Default_size];
        this.rear=0;
    }
    public SimpleQueue(int size){
        this.arr=new int[size];
        this.rear=0;
    }

    public void enqueue(int data) {
        if(isFull()){
            throw new IndexOutOfBoundsException("Queue is full!");
        }
        arr[rear] = data;
        rear++;

    }

    public int dequeue(){
        if(isEmpty()){
            throw new IllegalStateException("Queue is empty!");
        }
        int value=arr[0];
        for (int i = 1; i <rear; i++) {
            arr[i-1]=arr[i];
        }
        rear--;
        return value;
    }

    public int get(int index){
        return arr[index];
    }

    public int peek(){
        return arr[0];
    }
    public int getSize(){
        return this.rear;
    }

    public boolean isEmpty() {
        return rear==0;
    }

    public boolean isFull() {
        return rear== arr.length;
    }

    @Override
    public String toString() {
        return "SimpleQueue{" +
                  Arrays.toString(arr) +
                '}';
    }
}
