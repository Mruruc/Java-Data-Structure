package com.mruruc.binaryTree.Type_Of_Binary_Tree;
/*
* A Balanced binary Tree is a binary tree
* in which difference between left and right sube tree is 1.
* and left and right sube tree are balanced.
* */

import com.mruruc.binaryTree.BST_Tree.BST;

public class Balanced_Binary_Tree {
    private static Node root;


    public static void main(String[] args) {
        /*
         *   left  A   right
         *       /   \
         *      B     C
         *    /   \     \
         *   E      F    D
         **/
        root = new Node<>('A');
        root.left = new Node<>('B');
        root.right = new Node<>('C');
        root.left.left = new Node<>('E');
        root.left.right = new Node<>('F');
        root.right.left=new Node<>('G');
        root.right.right=new Node<>('D');
        printLevelOrder();
        System.out.println(isBalanced(root));

    }
    public static void printLevelOrder(){
        int height=height(root);
        for (int i = 0; i <= height+1; i++) {
            printGivenLevel(root,i);
            System.out.println();
        }

    }

    private static void printGivenLevel(Node root, int level) {
        if(root==null){
            return;
        }
        else if(level==1){
            System.out.print(root.data+" ");
        }
        else{
            printGivenLevel(root.left,level-1);
            printGivenLevel(root.right,level-1);
        }
    }

    public static boolean isBalanced(Node root){
        if (root == null){
            return true;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.abs(leftHeight - rightHeight) <= 1
                && isBalanced(root.left)
                && isBalanced(root.right);
    }

    static int height(Node root){
        if(root == null){
            return 0;
        }
        return Math.max(height(root.left), height(root.right)) + 1;
    }

    private static class Node<T>{
        private T data;
        private Node left,right;
        public Node(T data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
}
