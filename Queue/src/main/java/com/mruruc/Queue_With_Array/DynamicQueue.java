package com.mruruc.queue_with_array;

public class DynamicQueue<T> {

    private T[] queue;
    private int counter;
    private int DEFAULT_SIZE = 10;

    @SuppressWarnings("unchecked")
    public DynamicQueue() {
        this.queue = (T[]) new Object[DEFAULT_SIZE];
        this.counter = 0;
    }

    @SuppressWarnings("unchecked")
    public DynamicQueue(int size) {
        this.queue = (T[]) new Object[size];
        this.counter = 0;
    }

    public void enqueue(T data) {
        if (counter == queue.length) resize();
        queue[counter] = data;
        counter++;
    }

    public T peek() {
        if (isEmpty()) throw new IllegalStateException("Queue is empty!");
        return queue[0];
    }

    public T dequeue() {
        if (isEmpty()) throw new IllegalStateException("Queue is empty!");
        T removedElement = queue[0];
        // shift element in queue
        for (int i = 1; i < counter; i++) {
            queue[i - 1] = queue[i];
        }
        counter--;
        return removedElement;
    }

    @SuppressWarnings("unchecked")
    private void resize() {
        T[] temp = (T[]) new Object[queue.length * 2];
        System.arraycopy(queue,0,temp,0,queue.length);
        queue = temp;
    }

    public int size() {
        return this.counter;
    }

    public boolean isEmpty() {
        return this.counter == 0;
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < counter; i++) {
            builder.append(queue[i]).append(", ");
        }
        return "Queue[" + builder.toString() + "]";
    }


}

