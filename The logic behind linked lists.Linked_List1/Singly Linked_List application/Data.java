package Linked_List1;

public class Data {
    Node head;
    int counter;


    void addFirst(int data){
       Node node = new Node(data);
       node.pointer=head;
       head=node;
       counter++;
    }
    void addAfter(int data,Node previous){
        Node node =new Node(data);
        if(previous==null){
            node.pointer=head;
            head=node;
            counter++;
        }
        else{
            node.pointer=previous.pointer;
            previous.pointer=node;
            counter++;
        }
    }

    void addLast(int data) {
        Node node = new Node(data);
        if (head == null) {
            node.pointer = head;
            head = node;
            counter++;
        } else {
            Node temp = head;
            while (temp.pointer != null) {
                temp = temp.pointer;
            }
            temp.pointer = node;
            counter++;
        }
    }
    void sizeOfList(){
        System.out.println("The size of list ---->>>" +this.counter);
    }

    void printList(){
        Node temp=head;
        while(temp !=null){
            System.out.print(temp.data +" ");
            temp=temp.pointer;
        }
        System.out.println();
    }
    void deleteAt(Node previous){
        Node temp=head;
        if(temp==null){
            return;
        }
        else{
            previous.pointer=previous.pointer.pointer;
        }


    }
    //finding size of list with a function;
     int sizeFunction(){
        int counter=0;
        Node temp=head;
        while(temp !=null){
            temp=temp.pointer;
            counter++;
        }
        return counter;
    }

    static class Node {
        int data;
        Node pointer;

        public Node(int data) {
            this.data = data;
            this.pointer=null;
        }

    }

}