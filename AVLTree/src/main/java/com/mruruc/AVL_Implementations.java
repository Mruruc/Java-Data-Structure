package com.mruruc;

public class AVL_Implementations extends AVL{

    public void insert(int data){
        root=insert(root,data);
    }
    public void delete(int data){
        root=delete(root,data);
    }


    private Node insert(Node node, int data) {
        if(node==null){
            counter++;
            return new Node(data);
        }

        if(data< node.data){
            node.left=insert(node.left,data);
        }
        else if(data> node.data){
            node.right=insert(node.right,data);
        }
        else{
            throw new IllegalArgumentException("No Duplicate Element!");
        }
        return rotations(node,data);
    }
    private Node rotations(Node node, int data) {

        int bf=getBalanceFactor(node);

        if (bf > 1 && data < node.left.data) {
            return rightRotation(node);
        }
        if (bf < -1 && data > node.right.data) {
            return leftRotation(node);
        }
        if (bf > 1 && data > node.left.data) {
            node.left = leftRotation(node.left);
            return rightRotation(node);
        }
        if (bf < -1 && data < node.right.data) {
            node.right = rightRotation(node.right);
            return leftRotation(node);
        }
        return node;
    }
    private int getBalanceFactor(Node node){
        if(node==null){
            return -1;
        }
        return height(node.left) - height(node.right);
    }

    private Node delete(Node node, int element) {
        if(node==null){
            return node;
        }
        else if(element< node.data){
            node.left=delete(node.left,element);
        }
        else if (element> node.data) {
            node.right=delete(node.right,element);
        }
        //element we are searching if its match:
        else{
            if(node.left==null){
                Node temp=node.right;
                node=null;
                return temp;
            }
            else if(node.right==null){
                Node temp=node.left;
                node=null;
                return temp;
            }
            else{
                Node temp= rightMin(node.right);
                node.data=temp.data;
                node.right=delete(node.right,temp.data);
            }
        }
        return deleteRotation(node);
    }

    private Node deleteRotation(Node node) {
        int bf=getBalanceFactor(node);
        if(bf==2 && getBalanceFactor(node.left) >=0){
            return rightRotation(node);
        } 
        else if (bf==2 && getBalanceFactor(node.left)==-1) {
            node.left=leftRotation(node.left);
            return rightRotation(node);
        } else if (bf==-2 && getBalanceFactor(node.right) <-0) {
            return leftRotation(node);
        }
        else if(bf==-2 && getBalanceFactor(node.right)==1){
            node.right=rightRotation(node.right);
            return leftRotation(node);
        }
        return node;
    }

    private Node rightMin(Node node) {
            Node current = node;
            while (current.left != null) {
                current = current.left;
            }
            return current;
    }


    private Node leftRotation(Node x) {
        Node y = x.right;
        Node t = y.left;

        //rotation:
        y.left = x;
        x.right = t;

        return y;
    }

    private Node rightRotation(Node y) {
        Node x = y.left;
        Node t = x.right;

        //rotation:
        x.right = y;
        y.left = t;

        return x;
    }
}
