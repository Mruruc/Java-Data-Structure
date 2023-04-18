package com.mruruc.Stack_With_Array;

import java.util.Arrays;
public class Stack {
    private int[] arr;
    private final int DEFAULT_SIZE=10;
    private int counter;


    public Stack(int size){
        this.arr=new int[size];
        this.counter=0;
    }
    public Stack(){
      this.arr=new int[DEFAULT_SIZE];
      this.counter=0;
    }

    public int[] getArr(){
        return this.arr;
    }
    public void setArr(int[] arr){
        this.arr=arr;
    }

    public void push(int data){
        if(isFull()){
            throw new IndexOutOfBoundsException("Stack is full!");
        }
        arr[counter]=data;
        counter++;
    }

    public int pop(){
        if(isEmpty()){
            throw new IllegalStateException("Stack is Empty! :)");
        }
        counter--;
        int poppedElement=arr[counter];
        arr[counter]=0;
        return poppedElement;
    }

   public boolean isEmpty() {
        return counter==0;
    }

    public boolean isFull() {
        return counter== arr.length;
    }



    public int get(int index){
        return arr[index];
    }
    public int size(){
        return this.counter;
    }

    public void print(){
        for (int i = 0; i <counter; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Stack{" +
                Arrays.toString(arr) +
                '}';
    }
}
