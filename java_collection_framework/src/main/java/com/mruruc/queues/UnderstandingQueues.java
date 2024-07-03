package com.mruruc.queues;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class UnderstandingQueues {
    public static void main(String[] args) {

//        Queue<Integer> heap = new PriorityQueue<>();
//        heap.offer(5);
//        heap.offer(-65);
//        heap.offer(61);
//        heap.offer(94);
//        heap.offer(8);
//
//        System.out.println(heap);
//        System.out.println(heap.peek());
//        System.out.println(heap.poll());
//        System.out.println(heap.poll());
//        System.out.println(heap);
//
//        System.out.println(heap.remove(8));


        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(5);
        queue.offer(-65);
        queue.offer(61);
        queue.offer(94);
        queue.offer(8);

        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue);
    }
}
