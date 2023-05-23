package com.mruruc.binaryTree;

import java.util.Stack;

/*
 * Its tree  that every parent at most has two child.(max two child)
 * Binary tree has just one root, it can not have more than one root.
 * There is exactly one path between root node to any node.
 * */

public class BT {
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
        Node<Character> node2=new Node<>('B');
        Node<Character> node3=new Node<>('C');
        Node<Character> node4=new Node<>('D');
        Node<Character> node5=new Node<>('E');
        Node<Character> node6=new Node<>('F');

        root.left=node2;
        root.right=node3;
        node2.left=node5;
        node2.right=node6;
        node3.right=node4;

        print();
        preorderTraversal(root);
        System.out.println();
        inorderTraversal(root);
        System.out.println();
        postorderTraversal(root);
        System.out.println();
        rootRightLeft(root);

    }
    public static void rootRightLeft(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+"->");
        preorderTraversal(root.right);
        preorderTraversal(root.left);
    }

   // Postorder Traversal:
   public static void postorderTraversal(Node root){
       if(root==null){
           return;
       }
       preorderTraversal(root.left);
       preorderTraversal(root.right);
       System.out.print(root.data+"->");

   }

    //Inorder traversal
    public static void inorderTraversal(Node root){
        if(root==null){
            return;
        }
        preorderTraversal(root.left);
        System.out.print(root.data+"->");
        preorderTraversal(root.right);

    }

    //Preorder traversal
    public static void preorderTraversal(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+"->");
        preorderTraversal(root.left);
        preorderTraversal(root.right);

    }

    //Depth first search algorithm for printing:

    public static void print(){
        Node<Character> temp=root;
        Stack<Node<Character>> stack=new Stack<>();
        stack.push(temp);
        while (!stack.isEmpty()){
            temp=stack.pop();
            System.out.println(temp.data);
            if(temp.right!=null){
                stack.push(temp.right);
            }
            if (temp.left!=null){
                stack.push(temp.left);
            }
        }
    }




    static class Node<I>{
        private I data;
        private Node<I> left;
        private Node<I> right;


        public Node(I data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
}
