package com.mruruc;

public class SinglyLinkedList<T extends Comparable<T>> {
    public Node head;
    public Node tail;
    public int counter;

    public SinglyLinkedList() {
        this.counter = 0;
    }

    public void addFirst(T data) {
        Node node = new Node(data);

        if (head == null) {
            tail = node;
        } else {
            node.next = head;
        }

        head = node;
        counter++;
    }
    public void addAfter(T after,T data){
        if(isEmpty()){
            System.out.println("List is empty!");
            return;
        }

        Node newNode=new Node(data);
        Node temp= helper(after);

        if(temp!=null){
            newNode.next=temp.next;
            temp.next=newNode;
            counter++;

            if(temp==tail){
                tail=newNode;
            }
        }
        else {
            System.out.println("Element not found!");
        }


    }

    private Node helper(T data) {
        Node temp=head;

        while(temp!=null){

            if(data.equals(temp.data)){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }


    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("List is empty!");
            System.exit(0);
        }
        head = head.next;
        if (head == null) {
            tail = null;
        }
        counter--;
    }

    public void removeLast() {

        if (isEmpty()) {
            System.out.println("List is empty!");
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            Node temp = head;
            int i = 1;
            while (i < counter - 1) {
                temp = temp.next;
                i++;
            }
            temp.next = null;
            tail = temp;
        }
        counter--;
    }


    public void addLast(T data) {

        if (head == null) {
            addFirst(data);
            return;
        }
        Node node = new Node(data);
        tail.next = node;
        tail = node;
        counter++;
    }

    public boolean isEmpty(){
        return head==null;
    }


    public void getSize() {
        System.out.println("The size: " + this.counter);
    }


    public void print() {
        if (head == null) {
            System.out.println("The list is empty!");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }
}
