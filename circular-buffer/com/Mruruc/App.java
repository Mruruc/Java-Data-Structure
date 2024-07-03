package com.Mruruc;
public class App {
    public static void main(String[] args) {


       CircularBuffer buffer=new CircularBuffer();
        buffer.push(1);
        buffer.push(2);
        buffer.push(3);
        buffer.push(4);
        buffer.push(5);
        buffer.push(6);
        buffer.push(7);
        buffer.push(8);
        buffer.push(9);
        buffer.push(10);

        buffer.printBuffer();
        System.out.println(buffer.size());
        System.out.println("=================================");
        buffer.pop();
        buffer.pop();
        buffer.printBuffer();
        System.out.println(buffer.size());

        System.out.println("=================================");
        buffer.push(100);
        buffer.push(101);
        buffer.printBuffer();
        System.out.println(buffer.size());




    }
}
