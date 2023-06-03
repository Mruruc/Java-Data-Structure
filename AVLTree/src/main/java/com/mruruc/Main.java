package com.mruruc;

public class Main {
    public static void main(String[] args) {
        AVL_Implementations avl=new AVL_Implementations();
        int arr[]={9, 81, 10, 78, 21, 38, 27, 35, 55,28};
        for (int i = 0; i < arr.length; i++) {
            avl.insert(arr[i]);
        }

        avl.printGraphically();
        System.out.println(avl.getSize());
        System.out.println(avl.isEmpty());
        System.out.println(avl.maxElement());
        System.out.println(avl.minElement());
        avl.delete(28);
        avl.delete(38);
        avl.delete(21);
        avl.delete(55);

        avl.printGraphically();
        System.out.println(avl.peek());



    }
}