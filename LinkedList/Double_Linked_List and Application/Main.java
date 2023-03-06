package Linked_List1;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {

        DoubleList list=new DoubleList();
        list.addFirst(21);
        list.addFirst(13);
        list.addFirst(100);
        list.addFirst(7);

        list.printList();
        list.addLast(9);
        list.printList();
        System.out.println("====================================");
        list.printListReverse();
        System.out.println(list.getSize());
        list.addAt(2,5);
        list.printList();
        list.deleteFirst();
        list.printList();
















    }
}
