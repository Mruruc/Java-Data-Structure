package com.mruruc.main_concept;


public class MainConcept {

    public static void main(String[] args) {


        Node node1 = new Node(21);
        // node1 = head and node1.reference -> null

        Node node2 = new Node(65);
        node1.reference = node2;
        // node1 -> node2 -> null

        Node node3 = new Node(-35);
        node2.reference = node3;
        // node1 -> node2 -> node3 -> null

        Node node4 = new Node(90);
        node3.reference = node4;

        Node temp = node1;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.reference;
        }

    }

    static class Node {
        int data;
        Node reference;

        Node(int data) {
            this.data = data;
            this.reference = null;
        }
    }
}
