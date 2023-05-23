package com.mruruc.binaryTree.Type_Of_Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;

/*
* A complete binary tree is a binary tree in which all levels of the tree are completely filled,
*  except possibly the last level, which is filled from left to right.
*  In other words, if the last level of the tree is not completely filled,
*  the nodes in that level must be filled from left to right.
* */
public class Complete_Binary_Tree {
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
       // root.right.right=new Node<>('D');

        print(root);
        System.out.println(is_Complete_Binary_Tree(root));


    }
    // Count the number of nodes
    int countNumNodes(Node root) {
        if (root == null)
            return (0);
        return (1 + countNumNodes(root.left) + countNumNodes(root.right));
    }

    // Check for complete binary tree
    boolean checkComplete(Node root, int index, int numberNodes) {

        // Check if the tree is empty
        if (root == null)
            return true;

        if (index >= numberNodes)
            return false;

        return (checkComplete(root.left, 2 * index + 1, numberNodes)
                && checkComplete(root.right, 2 * index + 2, numberNodes));
    }

    static boolean is_Complete_Binary_Tree(Node root){
        if (root == null) {
            return true;
        }
        if (root.left == null && root.right == null){
            return true;
        }
        if (root.left == null && root.right != null){
            return false;
        }
        return is_Complete_Binary_Tree(root.left) && is_Complete_Binary_Tree(root.right);
    }


    public static boolean isCompleteBinaryTree(Node root) {
        // Base case: an empty tree is complete
        if (root == null) {
            return true;
        }

        // Create a queue to perform a level-order traversal of the tree
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        // Flag to keep track of whether we've encountered a node that's not a complete binary tree
        boolean flag = false;

        // Traverse the tree using BFS
        while (!queue.isEmpty()) {
            Node node = queue.poll();

            // If we've encountered a node that's not a complete binary tree, return false
            if (flag && (node.left != null || node.right != null)) {
                return false;
            }

            // If the current node has only one child or no children, set the flag
            if (node.left == null || node.right == null) {
                flag = true;
            }

            // Add the children of the current node to the queue
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }

        // If we've made it this far, the tree is a complete binary tree
        return true;
    }


    //finding the height of tree for checking that left and right tree are at same level.
    //The height of tree is from root to the deepest leaf.
    static int getHeight(Node root) {
        if (root == null) {
            return 0;
        }
        return Math.max(getHeight(root.right), getHeight(root.left)) + 1;
    }

    static void print(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        print(root.left);
        print(root.right);
    }


    private static class Node<T> {
        private T data;
        private Node<T> left;
        private Node<T> right;

        public Node(T element) {
            this.data = element;
            this.left = null;
            this.right = null;
        }
    }
}


