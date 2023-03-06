package Linked_List1;

public class DoubleList {
    private Node head;
    private Node tail;
    private int counter;

    void addFirst(int data){
        Node node=new Node(data);
        node.next =head;
        node.prev =null;
        if(head!=null){
           head.prev =node;
       }
        head=node;
        if(tail==null){
            tail=head;
        }

        counter++;
    }
    void addLast(int data){
        Node node= new Node(data);
        if(tail==null){
            addFirst(data);
            return;
        }
        tail.next =node;
        node.next =null;
        if(tail !=null){
            node.prev =tail;
        }
        tail=node;
        counter++;

    }
    void addAt(int index,int data){
        if (index < 0 || index > counter) {
            System.out.println("Invalid index!");
            return;
        }
        Node node=new Node(data);
        Node temp=head;
        for (int i = 1; i < index; i++) {
            temp=temp.next;
        }
        node.next=temp.next;
        if(temp.next!=null){
            temp.next.prev=node;
        }
        temp.next=node;
        node.prev=temp;

        counter++;
    }

    void deleteFirst() {
        if (head == null) {
            return;
        }
        if (head.next != null) {
            head.next.prev = null;
        }
        head = head.next;
        counter--;
    }

    public void printList(){
        Node temp=head;
        System.out.print("null<----");
        while(temp!=null){
            System.out.print(temp.data+"--->");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public int getSize(){
        return counter;
    }
    public void printListReverse(){
        Node temp=tail;
        while(temp!=null){
            System.out.print(temp.data+"--->");
            temp=temp.prev;
        }
        System.out.println();
    }
    private class Node{
        private int data;
        private Node next;
        private Node prev;

        public Node(int data){
            this.data=data;
        }
    }

}
