package com.mruruc;

public class RotatedBinarySearch {

    public static int search(int[] arr,int element,int s,int e){
        if(s>e){
            return -1;
        }

        int middle=s+(e-s)/2;


        if(arr[middle]==element){
            return middle;
        }
        if (arr[s] <= arr[middle]) {
            if (element >= arr[s] && element <= arr[middle]) {
                return search(arr, element, s, middle-1);
            } else {
                return search(arr, element, middle+1, e);
            }
        }

        if (element >= arr[middle] && element <= arr[e]) {
            return search(arr, element, middle+1, e);
        }

        return search(arr, element, s, middle-1);
    }


    }

