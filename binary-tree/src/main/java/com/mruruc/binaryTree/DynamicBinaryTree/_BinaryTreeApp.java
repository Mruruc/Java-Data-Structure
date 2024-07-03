package com.mruruc.binaryTree.DynamicBinaryTree;
/*
* Its tree  that every parent at most has two child.(max two child)
* Binary tree has just one root, it can not have more than one root.
* There is exactly one path between root node to any node.
* */

import com.mruruc.binaryTree.DynamicBinaryTree.DynamicBinaryTree;

public class _BinaryTreeApp {

    public static void main(String[] args) {

        DynamicBinaryTree<Character> tree=new DynamicBinaryTree<>('A');
        tree.add('B');
        tree.add('C');
        tree.add('D');
        tree.add('E');
        System.out.println("Size:"+tree.getSize());
        tree.print();
    }
}
