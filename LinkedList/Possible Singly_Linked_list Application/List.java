package Linked_List1;

public class List {
    private Node head;
    private Node tail;
    private int counter;

    public void addFirst(String name,String last_name){
        Node node=new Node(name,last_name);
        node.pointer=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        counter++;
    }
    public void addLast(String name,String last_name){
        Node node=new Node(name,last_name);
        if(tail==null){
            addFirst(name,last_name);
            counter++;
        }
        else{
           tail.pointer=node;
           tail=node;
            counter++;
        }
    }
    public void addAt(int index,String name,String last_name){
        Node node=new Node(name,last_name);
        if(index==0){
            addFirst(name,last_name);
            return;
        }
        if(index==counter){
            addLast(name,last_name);
            return;
        }
        Node temp=head;
        for (int i = 1; i < index; i++) {
            temp=temp.pointer;
        }
        node.pointer=temp.pointer;
        temp.pointer=node;
        counter++;
    }
    public void printList(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.name +":"+ temp.last_name);
            temp=temp.pointer;
        }

    }
    public String deleteFirst(){
        String valueRemoved=head.name +":"+ head.last_name;
        head=head.pointer;
        counter--;
        return valueRemoved;

    }
    String deleteLast(){
      if(counter <=1){
          counter--;
          return deleteFirst();
      }
      Node temp=head;
        for (int i = 1; i <counter-1; i++) {
            temp=temp.pointer;
        }
        String valueRemoved=tail.name +":"+ tail.last_name;
        temp.pointer=null;
        tail=temp;
        counter--;
        return valueRemoved;
    }
    String deleteAt(int index){
        if(index==0){
            counter--;
            return deleteFirst();
        }
        if(index==counter-1){
            return deleteLast();
        }
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.pointer;
        }
        String valueRemoved = temp.pointer.name + ":" + temp.pointer.last_name;
        temp.pointer = temp.pointer.pointer;
        counter--;
        return valueRemoved;
    }
    public int getSize(){
        return this.counter;
    }

   private class Node{
       private String name;
       private String last_name;
       private Node pointer;
       public Node(String name,String last_name) {
           this.name = name;
           this.last_name=last_name;
           this.pointer=null;
       }
   }
}