package com.mruruc.main_concept;

public class SimpleQueue {
    private int[] array;
    private int counter;
    private final int DEFAULT_SIZE=10;

    public SimpleQueue(){
        this.array =new int[DEFAULT_SIZE];
        this.counter =0;
    }
    public SimpleQueue(int size){
        this.array =new int[size];
        this.counter =0;
    }

    public void enqueue(int data) {
        if(isFull()){
            throw new IndexOutOfBoundsException("Queue is full!");
        }
        array[counter] = data;
        counter++;

    }

    public int dequeue(){
        if(isEmpty()){
            throw new IllegalStateException("Queue is empty!");
        }
        int value= array[0];
        for (int i = 1; i < counter; i++) {
            array[i-1]= array[i];
        }
        counter--;
        return value;
    }

    public int get(int index){
        return array[index];
    }

    public int peek(){
        return array[0];
    }
    public int size(){
        return this.counter;
    }

    public boolean isEmpty() {
        return counter ==0;
    }

    public boolean isFull() {
        return counter == array.length;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < counter; i++) {
            builder.append(array[i]).append(", ");
        }
        return "SimpleQueue[" +
                  builder.toString() +
                ']';
    }
}
