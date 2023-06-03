package com.mruruc;

public class AVL {
    Node root;
    int counter;


    public int peek(){
        if(root==null){
            throw new RuntimeException("Tree is Empty");
        }
        return root.data;
    }

    public int minElement(){
        Node temp=root;
        while (temp.left!=null)
            temp=temp.left;

        return temp.data;
    }


    public int maxElement(){
        Node temp=root;
        while(temp.right!=null){
            temp=temp.right;
        }
        return temp.data;
    }

    public int getSize(){
        return this.counter;
    }
    public boolean isEmpty(){
        return counter==0;
    }
    public int height(Node node){
        if(node == null){
            return -1;
        }
        return Math.max(height(node.left),height(node.right)) +1;
    }

    private static int Space=5;
    private void printGraphicallyHelper(Node root,int space){
        if(root==null){
            return;
        }
        space=space+Space;
        printGraphicallyHelper(root.right,space);
        System.out.println();
        for (int i =Space; i <space ; i++) {
            System.out.print(" ");
        }
        System.out.print(root.data);
        printGraphicallyHelper(root.left,space);
    }

    public void printGraphically(){
        printGraphicallyHelper(root,5);
        System.out.println();
    }

    protected class Node{
        Node left;
        Node right;
        int data;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
}
