package com.mruruc;

import java.util.Arrays;

public class ReverseArray {
    public static void reverse(int[] arr){
        int firstIndex=0;
        int lastIndex=arr.length-1;
        for (int i = 0; lastIndex>firstIndex; i++,firstIndex++,lastIndex--) {
            swap(arr,firstIndex,lastIndex);
        }
        
    }
    public static void swap(int[] arr,int firstIndex,int lastIndex){
        int temp=arr[firstIndex];
        arr[firstIndex]=arr[lastIndex];
        arr[lastIndex]=temp;
    }

    public static void main(String[] args) {
        int [] arr={2,5,799,12,17,0,-4,-1234};
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}
