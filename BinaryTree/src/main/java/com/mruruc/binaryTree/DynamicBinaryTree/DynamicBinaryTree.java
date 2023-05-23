package com.mruruc.binaryTree.DynamicBinaryTree;


import java.util.Stack;

public class DynamicBinaryTree<T extends Comparable<T>> {
    private Node<T> root;
    private Integer counter;


    public DynamicBinaryTree(T element){
        this.root=new Node<>(element);
        this.counter=1;
    }

    //Adding element based on the BST tree approach:
    public void add(T element){
        if(root==null){
            root= new Node<>(element);
        }
        else {
            addBasedOnBST(root,element);
        }
        counter++;
    }

    private void addBasedOnBST(Node<T> root, T element) {
        //insert to left side:
        if(element.compareTo(root.data)<0){
            if(root.left==null){
                root.left=new Node<>(element);
            }
            else{
                addBasedOnBST(root.left,element);
            }
        }
        //insert to right side:
        else if(element.compareTo(root.data)>0){
            if(root.right==null){
                root.right=new Node<>(element);
            }
            else{
                addBasedOnBST(root.right,element);
            }
        }
    }
    public Integer  getSize(){
        return this.counter;
    }

    //Preorder Traversal:
    public void preorderTraversal(){
        preorder(root);
        System.out.println();
    }
    private void preorder(Node<T> root){
        if(root==null){
            return;
        }
        System.out.print(root.data+"->");
        preorder(root.left);
        preorder(root.right);

    }

    // inorder traversal
    public void inorderTraversal() {
        inorder(root);
        System.out.println();
    }

    // recursive helper method for inorder traversal
    private void inorder(Node<T> node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    // postorder traversal
    public void postorderTraversal() {
        postorder(root);
        System.out.println();
    }

    // recursive helper method for postorder traversal
    private void postorder(Node<T> node) {
        if (node == null) {
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }

    //Depth first search algorithm for printing:
    public void print(){
        Node<T> temp=root;
        Stack<Node<T>> stack=new Stack<>();
        stack.push(temp);
        while (!stack.isEmpty()){
            temp=stack.pop();
            System.out.print(temp.data+" ");
            if(temp.right!=null){
                stack.push(temp.right);
            }
            if (temp.left!=null){
                stack.push(temp.left);
            }
        }
    }


    private class Node<I> {
        private Node<I> left;
        private Node<I> right;
        private I data;

        public Node(I data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
}
