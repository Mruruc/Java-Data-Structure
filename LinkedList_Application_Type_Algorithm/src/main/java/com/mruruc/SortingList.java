package com.mruruc;

import java.util.Comparator;

public class SortingList<T extends Comparable<T>> extends SinglyLinkedList{
    private Comparator<T> comparator;

    public void setComparator(Comparator<T> comparator) {
        this.comparator = comparator;
    }


    //O(n*logn)
    public void mergeSort() {
        if (head == null || head.next == null) {
            return;
        }
        head = mergeSortHelper(head);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        tail = temp;
    }

    private Node mergeSortHelper(Node node) {
        if (node == null || node.next == null) {
            return node;
        }

        Node middle = getMiddle(node);
        Node middleNext = middle.next;
        middle.next = null;

        Node left = mergeSortHelper(node);
        Node right = mergeSortHelper(middleNext);

        return merge(left, right);
    }

    private Node getMiddle(Node node) {
        if (node == null) {
            return null;
        }
        Node slow = node;
        Node fast = node.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private Node merge(Node left, Node right) {
        Node result;

        if (left == null) {
            return right;
        }

        if (right == null) {
            return left;
        }

        if (left.data.compareTo(right.data) <= 0) {
            result = left;
            result.next = merge(left.next, right);
        } else {
            result = right;
            result.next = merge(left, right.next);
        }

        return result;
    }

    //O(n^2)
    public void bubbleSort() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        boolean swapped;
        Node temp1 = null;

        do {
            swapped = false;
            Node temp2 = head;

            while (temp2.next != temp1) {

                if (temp2.data.compareTo(temp2.next.data) > 0) {
                    T temp = (T) temp2.data;
                    temp2.data = temp2.next.data;
                    temp2.next.data = temp;
                    swapped = true;
                }

                temp2 = temp2.next;

            }

            temp1 = temp2;

        } while (swapped);
    }


 /*   public void bubbleSort(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        for (Node temp1 = head; temp1!=null; temp1=temp1.next) {
            for (Node temp2 = head; temp2.next!=null; temp2=temp2.next) {
                if(temp2.id>temp2.next.id){
                    int temp= temp2.id;
                    temp2.id=temp2.next.id;
                    temp2.next.id=temp;
                }
            }
        }
    }*/
}
