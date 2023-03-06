package Linked_List1;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {
        List list=new List();
        list.addFirst("John","Robinson");
        list.addFirst("Dominika","Robinson");
        list.addFirst("Mateus","Brown");
        list.addFirst("David ","Wilson");
        list.addFirst("Sarah","Johnson");

        list.printList();
        System.out.println("========================================");
        list.addLast("Michael ","Smith");
        list.printList();
         System.out.println("==============");
        list.addAt(2,"Elizabeth"," No Data");
        list.printList();
        System.out.println("======after======");
        System.out.println("This value is removed --->>" +list.deleteFirst());
        list.printList();
        System.out.println("The size of list --->>"+ list.getSize());
        System.out.println("===============================");

        System.out.println("The last element is removed --->>"+list.deleteLast());
        list.printList();
        System.out.println("The size of list --->>"+ list.getSize());

        list.printList();
        System.out.println("The size of list --->>"+ list.getSize());
        System.out.println("====================================");
        System.out.println("This element is removed---->>" +list.deleteAt(3));
        list.printList();
        System.out.println("The size of list --->>"+ list.getSize());














    }
}
