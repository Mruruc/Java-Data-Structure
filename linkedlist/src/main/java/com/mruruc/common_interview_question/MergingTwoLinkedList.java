package com.mruruc.common_interview_question;

public class MergingTwoLinkedList {


    public static void main(String[] args) {
        // first list
        ListNode<Integer> node1 = new ListNode<>(1);
        ListNode<Integer> node2 = new ListNode<>(2);
        node1.next = node2;
        ListNode<Integer> node3 = new ListNode<>(3);
        node2.next = node3;

        // second list
        ListNode<Integer> node4 = new ListNode<>(3);
        ListNode<Integer> node5 = new ListNode<>(4);
        node4.next = node5;
        ListNode<Integer> node6 = new ListNode<>(5);
        node5.next = node6;

        ListNode<Integer> mergeList = mergeList(node1, node4);
        ListNode<Integer> temp = mergeList;
        while (temp != null) {
            System.out.print(temp.value + ",");
            temp = temp.next;
        }

    }

    static ListNode<Integer> mergeList(ListNode<Integer> list1, ListNode<Integer> list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;


        ListNode<Integer> mergedList = new ListNode<>(0);
        ListNode<Integer> current = mergedList;

        while (list1 != null && list2 != null) {
            if (list1.value < list2.value) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return mergedList.next;
    }


    static class ListNode<T> {
        T value;
        ListNode<T> next;

        ListNode(T x) {
            value = x;
        }
    }
}
