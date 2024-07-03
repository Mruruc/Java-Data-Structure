package com.mruruc.binaryTree.Type_Of_Binary_Tree;

/*A perfect binary tree is a type of binary tree
 in which every internal node has exactly two child nodes
 and all the leaf nodes are at the same level.
 =>every perfect binary tree are also full binary tree.
 */
public class Perfect_Binary_Tree {
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
     //   root.right.right=new Node<>('D');

        print(root);
        System.out.println(isPerfectBinaryTree(root));
    }


    static boolean isPerfectBinaryTree(Node root){
        if(root==null){
            return true;
        }
        if((root.left==null) && (root.right==null)){
            return true;
        }
        if((root.left!=null) && (root.right!=null)){
            return (isPerfectBinaryTree(root.left)) && (isPerfectBinaryTree(root.right))
                    && getHeight(root.left)==getHeight(root.right);
        }
        return false;
    }

    //finding the height of tree for checking that left and right tree are at same level.
    //The height of tree is from root to the deepest leaf.
    static int getHeight(Node root){
        if(root==null){
            return 0;
        }
        return Math.max(getHeight(root.right),getHeight(root.left)) +1;
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
