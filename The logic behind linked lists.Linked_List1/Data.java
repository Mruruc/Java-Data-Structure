package Linked_List1;

public class Data {
    Node head;
    void printList(){
        Node temp=head;
        while(temp !=null){
            System.out.print(temp.data + " ");
            temp=temp.pointer;
        }
        System.out.println();
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