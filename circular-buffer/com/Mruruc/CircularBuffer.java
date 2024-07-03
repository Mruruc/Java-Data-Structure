package com.Mruruc;

public class CircularBuffer {
    private int[] arr;
    private final int DEFAULT_SIZE=10;
    private int firstIndex=0;
    private int firstRead;
    private boolean full = false;

    public CircularBuffer(){
        this.arr=new int[DEFAULT_SIZE];
    }

    public CircularBuffer(int size){
        this.arr=new int[size];
    }
    public void push(int element) {
        if(flag()){
            throw new ArrayIndexOutOfBoundsException("Buffer is full");
        }
        arr[firstIndex]=element;
        firstIndex =(firstIndex+1) % arr.length;
        full=firstIndex==firstRead;
    }
    public void pop(){
        if(firstIndex==firstRead && !full){
            throw new ArrayStoreException("Buffer is Empty!");
        }
        arr[firstRead]=0;
        firstRead=(firstRead +1) % arr.length;
        full=false;
    }

    private boolean flag() {
        return full;
    }

    public int size() {
        int size = firstIndex - firstRead;
        if (size < 0) {
            size += arr.length;
        }
        return full ? arr.length : size;
    }

    public void printBuffer(){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}