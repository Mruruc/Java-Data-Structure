package com.mruruc;

public class LinearSearch {

    public static boolean search(int[] arr,int element,int index){
        if(index== arr.length-1){
            return false;
        }
        return arr[index]==element || search(arr,element,index+1);
    }
}
