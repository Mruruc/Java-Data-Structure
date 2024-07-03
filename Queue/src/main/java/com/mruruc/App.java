package com.mruruc;

import com.mruruc.queue_with_array.DynamicQueue;

public class App {
    public static void main(String[] args) {
        DynamicQueue<String> queue = new DynamicQueue<>();

        System.out.println(queue);
        queue.enqueue("John");
        queue.enqueue("Jane");

        System.out.println(queue);
        System.out.println("Size: "+queue.size());

        queue.dequeue();
        System.out.println(queue);
        System.out.println("Size: "+queue.size());

    }
}
