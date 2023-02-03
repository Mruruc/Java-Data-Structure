package Linked_List1;

public class CircularList {
    private Node head;
    private Node tail;
    private int counter;

    void addFirst(int data){
        Node node=new Node(data);
        node.next=head;
        if(tail==null){
            tail=head;
        }
        if(tail!=null){
            tail.next=node;
        }
        head=node;
        counter++;
    }

    void delete(int index){
        if(index<0 || index>counter){
            System.out.println("invalid index");
            return;
        }
        Node temp=head;
        if(index==counter-1){
            for (int i = 1; i ==counter-1 ; i++) {
                temp=temp.next;
            }
            temp.next=head;
            tail=temp;
            counter--;
        }
        if(index==0){
            head=head.next;
            tail.next=head;
            counter--;
        }
        else{
            for (int i = 1; i <index; i++) {
                temp.next=temp.next.next;
            }
        }
    }

    void printList(){
        Node temp=head;
        int i=0;
        while(temp!=null && i<counter){
            System.out.print(temp.data+"--->");
            temp=temp.next;
            i++;
        }
        System.out.println();
    }

    private class Node{
        private Node next;
        private int data;
        public Node(int data){
            this.data=data;
        }
    }
}

