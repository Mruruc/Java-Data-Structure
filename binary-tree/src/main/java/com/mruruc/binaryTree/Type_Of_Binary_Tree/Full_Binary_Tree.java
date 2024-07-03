package com.mruruc.binaryTree.Type_Of_Binary_Tree;
/*
* evey parent node /internal node:
* has either two or no children.
* */

public class Full_Binary_Tree<T> {
    private static Node root;

    public static void main(String[] args) {
        /*
         *   left  A   right
         *       /   \
         *      B     C
         *    /   \     \
         *   E      F    D
         **/

        root=new Node<>('A');
        root.left=new Node<>('B');
        root.right=new Node<>('C');
        root.left.left=new Node<>('E');
        root.left.right=new Node<>('F');
//      root.right.left=new Node<>('G');
       root.right.right=new Node<>('D');

        print(root);

        System.out.println(isFullBinaryTree(root));

    }

    static boolean isFullBinaryTree(Node root){
        if(root==null){
            return true;
        }
        if((root.left==null) && (root.right==null) ){
            return true;
        }
        if((root.left!=null) && (root.right!=null)){
            return (isFullBinaryTree(root.left)) && (isFullBinaryTree(root.right));
        }
        return false;
    }


    static void print(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        print(root.left);
        print(root.right);
    }


    private static class Node<T>{
        private T data;
        private Node<T> left;
        private Node<T> right;

        public Node(T element){
            this.data=element;
            this.left=null;
            this.right=null;
        }
    }
}
