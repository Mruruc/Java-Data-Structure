package com.mruruc;

public class SearchingInList<T> extends SinglyLinkedList{

    //O(n*logn)
    private boolean binarySearch(Node currentNode, T data, int startIndex, int endIndex) {

        if (startIndex > endIndex) {
            return false;
        }

        int middleIndex = (startIndex + endIndex) / 2;

        Node middleNode = helper(middleIndex);

        if (middleNode.data.compareTo(data) == 0) {
            return true;
        } else if (middleNode.data.compareTo(data) < 0) {
            return binarySearch(middleNode.next, data, middleIndex + 1, endIndex);
        } else {
            return binarySearch(currentNode, data, startIndex, middleIndex - 1);
        }
    }

    private Node helper(int index) {
        Node temp = head;
        int i=0;
        while(temp!=null){
            if(i==index){
                return temp;
            }
            temp=temp.next;
            i++;
        }
        return temp;
    }

    //O(n)
    public boolean linearSearch(T data){

        Node temp=head;
        while(temp!=null){
            if(temp.data.equals(data)){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }

}
