package com.Mruruc.SortingAlgorithm.BubbleSort;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSortASC(int[] arr){
        boolean swapped=false;
        for (int i = 0; i <arr.length; i++) {
            for (int j = 1; j <arr.length-i; j++) {
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    public static void bubbleSortDESC(int[] arr){
        boolean swapped=false;
        for (int i = 0; i <arr.length; i++) {
            for (int j = 1; j <arr.length-i; j++) {
                if(arr[j]>arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }

}




