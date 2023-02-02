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








      /* //This line creates a new object of the Data class and assigns it to the variable data1.
        //data1 is represents our list;
        Data data1 =new Data();
        //This line creates a new object of the Node class (which is an inner class of the Data class)
        // and sets it as the head node of the linked list represented by data1.
        // The argument 1 is passed to the constructor of the Node class to set the value of the node to 1.
        data1.head=new Data.Node(1);
        System.out.println(data1.head.data);
        // This line creates a new object of the Node class and assigns it to the variable second.
        // The argument 3 is passed to the constructor of the Node class to set the value of the node to 3.
        Data.Node second=new Data.Node(3);
        System.out.println(second.data);
        //This line creates a new object of the Node class and assigns it to the variable third.
        //The argument 5 is passed to the constructor of the Node class to set the value of the node to 5.
        Data.Node third=new Data.Node(5);
        System.out.println(third.data);
        // This line sets the pointer field of the head node to second,
        // linking the head node to the second node in the linked list.
        data1.head.pointer=second;
        System.out.println(data1.head.pointer);
        System.out.println(second);
        //This line sets the pointer field of the second node to third,
        // linking the second node to the third node in the linked list.
        second.pointer=third;
        //This line calls the printList method on the data1 object to print the linked list.
        //data1.printList();*/





    }
}
