package Linked_List1;

public class Main {

    public static void main(String[] args) {

        CircularList list=new CircularList();

        list.addFirst(2);
        list.addFirst(5);
        list.addFirst(8);
        list.addFirst(7);
        list.printList();
        list.delete(0);
        list.printList();
        list.delete(2);
        list.printList();






    }
}
