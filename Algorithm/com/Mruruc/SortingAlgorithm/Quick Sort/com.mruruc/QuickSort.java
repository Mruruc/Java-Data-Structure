package com.mruruc;

public class QuickSort{

    public static void sort(int[] arr, int start, int end) {

        if (start>=end) {
            return;
        }
        int pivotIndex=partition(arr,start,end);
        sort(arr,start,pivotIndex-1);
        sort(arr,pivotIndex+1,end);

    }

    private static int partition(int[] arr, int start, int end) {

        int pivot=arr[end];
        int counter=start;

        for (int i = start; i <end; i++) {
            if(arr[i]<=pivot){
                swap(arr,i,counter);
                counter++;
            }
        }
        swap(arr,counter,end);
        return counter;
    }

    private static void swap(int[] arr, int i, int i1) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }
}