package Java_Collections;

import java.util.*;

public class ListInterface {
    public static void main(String[] args) {

        /*
        The list interface extends from collection interface,
        and it helps us to store elements in sequential order;
        1) element of the list can be accessed and identified based on their index position.
        (List follows a zero-based index structure)
        2)List allows storing duplicate elements (List is not unique).
        3)List is resizeable.
        */
                           //Methods;
        //Since list interface extends from collection interface,
        // so all methods of collection interface are also available in the list interface;

        // Methods are available in list interface but not available in Collection interface;

        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(1);
        list.add(9);
        list.add(11);
        System.out.println(list);

        //get(int index)---> returns the element at the specified position;
        int getelement=list.get(4);
        System.out.println("The element at the 4.th position --->>"+getelement);

        //indexOf(Object)---> returns the index of first occurrence of the specified element in the list;
        int getIndex= list.indexOf(5);
        System.out.println("The index of 5 element--->>"+getIndex);

        //lastIndexOf() ---->> returns the index of last occurrence of specified element in the list or
        // -1 if the element does not exist;
        int lastIndex=list.lastIndexOf(1);
        System.out.println("The last index--->"+lastIndex);

        //listIterator() ---> returns the ListIterator Object for iterating through the elements of the list,
        //starting from beginning of the list;
        //listIterator(int index)--->it just starts from specified position;

        ListIterator<Integer> listIterator= list.listIterator(3);
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }


        //subList(index fromIndex,int toIndex)--->>>return a sublist between the specified "fromIndex"-->>inclusive,
        //"toIndex" exclusive:
        List<Integer> subList=list.subList(2,5);
        System.out.println(subList);

        //add(int index,Object element)----->> inserts element into specified index,
        // if the list already has element at the specified index,they are shifted the right side.
        list.add(2,0);
        System.out.println(list);

        //set(int index,Object element)-----> replace the element at the specified index,
        //it returns the replaced element;
        System.out.println(list.set(2,8));
        System.out.println(list);

        //remove(Object element)----> it removes the first occurrence of the specified element,if it is present:
        //list.remove(11);
        boolean bool=list.remove(new Integer(8));
        System.out.println(list);

        //remove(int index)---->removes element at the specified position in the list and returns the removed element;
        System.out.println(list.remove(4));
        System.out.println(list);

        // addAll(int index,Collection c)----->> inserts all elements of a collection into current list at the specified index,
        // if current list has element in current index,they are shifted to the right;

        List<Integer> list2=new ArrayList<>();
        list2.add(5);
        list2.add(33);
        list2.add(7);
        System.out.println(list2);
        list.addAll(2,list2);
        System.out.println(list);

    }
}
