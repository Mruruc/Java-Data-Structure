package com.mruruc;

public class DoublyLinkedList<T extends Comparable<T>>{
    public Node head;
    public Node tail;
    protected int counter;
    public DoublyLinkedList(){
        this.counter=0;
        this.head=null;
        this.tail=null;
    }

    public void addFirst(T data) {
        Node node = new Node(data);

        if (isEmpty()) {
            tail = node;
        } else {
            node.next = head;
            head.prev=node;
        }

        head = node;
        head.prev=null;
        counter++;
    }

    public void removeFirst(){
        if(isEmpty()){
            System.out.println("List is Empty!");
            return;
        }
        if(head.next!=null){
            head.next.prev=null;
        }

        head=head.next;

        if(head==null){
            tail=null;
        }
        counter--;
    }
    public void removeLast(){
        if(isEmpty()){
            System.out.println("List is Empty!");
            return;
        }
       if(tail.prev!=null) {
           tail = tail.prev;
           tail.next = null;
       }
       else {
           tail=null;
           head=null;
       }
        counter--;
    }


    //Unlike SinglyLinked list it has O(1) Complexity.
    public void addLast(T data) {
        if(isEmpty()){
            addFirst(data);
            return;
        }
        Node node=new Node(data);
        node.prev=tail;
        tail.next=node;
        tail=node;
        counter++;
    }

    public int getSize(){
        return this.counter;
    }
    public boolean isEmpty(){
        return head == null;
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
