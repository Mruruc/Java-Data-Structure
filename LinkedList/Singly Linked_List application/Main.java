package Linked_List1;

public class Main {

    public static void main(String[] args) {

         Data data=new Data();
         data.addFirst(5);
         data.addFirst(9);
         data.addFirst(13);
         data.addAfter(6,data.head); //it will add after head.
         data.addAfter(20,data.head.pointer);// it will add after second.
         data.addAfter(30,data.head.pointer.pointer);// it will add after third. and so on !
         data.addLast(1);

        data.sizeOfList();
        System.out.println("size function---->>  "+data.sizeFunction());

        data.printList();
        data.deleteAt(data.head.pointer);

        data.printList();


    }
}
