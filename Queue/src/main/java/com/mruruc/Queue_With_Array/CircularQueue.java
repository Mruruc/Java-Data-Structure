package com.mruruc.Queue_With_Array;

import java.util.Arrays;

public class CircularQueue {
    private String[] arr;
    private final int DEFAULT_SIZE=10;
    private int front;
    private int rear;
    private int counter;

    public CircularQueue(){
        this.arr=new String[DEFAULT_SIZE];
        this.front=0;
        this.rear=0;
        this.counter=0;
    }
    public CircularQueue(int size){
        this.arr=new String[size];
        this.front=0;
        this.rear=0;
        this.counter=0;
    }

    public void enqueue(String data){
        if(isFull()){
            throw new IndexOutOfBoundsException("Your Queue is full baby!");
        }
        arr[rear]=data;
        rear=(rear+1)% arr.length;
        counter++;
    }

    public String deQueue(){
        if(isEmpty()){
            throw new IllegalStateException("Queue is Empty!");
        }
        String removed=arr[front];
        arr[front]="";
        front++;
        counter--;
        return removed;
    }

    public String peek(){
        return arr[front];
    }


    public int size(){
        return this.counter;
    }
    public boolean isFull() {
        return counter==arr.length;
    }

    public boolean isEmpty(){
        return counter==0;
    }

    public void print(){
        if(isEmpty()){
            throw new IllegalStateException("Queue is Empty!");
        }
       int i=front;
        do{
            System.out.print(arr[i]+" ");

            i=(i+1) % arr.length;
        }
        while(i!=rear);

        System.out.println();
    }

}
