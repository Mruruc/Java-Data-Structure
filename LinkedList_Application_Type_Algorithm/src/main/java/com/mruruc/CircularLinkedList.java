package com.mruruc;

public class CircularLinkedList<T extends Comparable<T>> {
    public Node head;
    public Node tail;
    public int counter;

    public CircularLinkedList() {
        this.counter =0;
    }

    public boolean isEmpty(){
        return head==null;
    }
    public int getSize(){
        return this.counter;
    }

    public void addFirst(T data){
        Node node=new Node(data);

        if(isEmpty()){
           tail=node;
        }
        else{
            node.next=head;
            head.prev=node;
            node.prev=tail;
            tail.next=head;
        }
        head=node;
        counter++;
    }

    public void addLast(T data){
        if(isEmpty()){
            addFirst(data);
            return;
        }
        Node node=new Node(data);
        node.prev=tail;
        node.next=head;
        tail.next=node;
        head.prev=node;
        tail=node;
        counter++;

    }

    public void removeFirst() {
        if(isEmpty()){
            System.out.println(
                    "List is Empty Baby!"
            );
            return;
        }
        if(head==tail){
            head=null;
            tail=null;
        }
       else {
            tail.next=head.next;
            head.next.prev=tail;
            head=head.next;
        }
        counter--;

    }
    public void removeLast() {
        if(isEmpty()){
            System.out.println(
                    "List is Empty Baby!"
            );
            return;
        }
        if(head==tail){
            head=null;
            tail=null;
        }else{
         tail.prev.next=head;
         head.prev=tail.prev;
         tail=tail.prev;
        }
        counter--;
    }

    public void print(){
        if(isEmpty()){
            System.out.println(
                    "List is Empty Baby!"
            );
            return;
        }

        Node temp=head;
        while(temp!=tail){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println(tail.data);
    }


}
