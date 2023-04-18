package com.mruruc.Queue_With_Array;

public class DynamicQueue<T>{
    private T[] arr;
    private final int DEFAULT_SIZE=10;
    private int front;
    private int rear;
    private int counter;

    public DynamicQueue(){
        this.arr= (T[]) new Object[DEFAULT_SIZE];
        this.front=0;
        this.rear=0;
        this.counter=0;
    }
    public  DynamicQueue(int size){
        this.arr=(T[])new Object[size];
        this.front=0;
        this.rear=0;
        this.counter=0;
    }

    public void  enqueue(T data){
        if(isFull()){
          resize();
        }
        arr[rear]=data;
        rear=(rear+1)% arr.length;
        counter++;
    }

    private void resize() {
        T[] temp=(T[]) new Object[arr.length*2];
        for (int i = 0; i <counter; i++) {
            temp[i]=arr[(front+i)% arr.length];

        }
        front=0;
        rear= arr.length;
        arr=temp;

    }

    public T deQueue(){
        if(isEmpty()){
            throw new IllegalStateException("Queue is Empty!");
        }
       T removed=arr[front];
        arr[front]=null;
        front++;
        counter--;
        return removed;
    }

    public T peek(){
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

