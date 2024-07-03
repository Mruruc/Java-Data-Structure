package com.mruruc;

import java.util.Arrays;

public class MergeSort {

    static int[] mergeSort(int[] arr){
        if(arr.length==1){
            return arr;
        }
       int middle= arr.length/2;
        int[] left= mergeSort(Arrays.copyOfRange(arr,0,middle));
        int[] right=mergeSort(Arrays.copyOfRange(arr,middle,arr.length));

        return merge(left,right);

    }

    private static int[] merge(int[] first, int[] second) {
        int[] mergeArr=new int[first.length+second.length];

        //index for first array:
        int i=0;
        //index for second array:
        int j=0;
        //index for result Array:
        int k=0;

        //until any of first and second array length not zero put them into new array:

        while((i<first.length)&& (j<second.length)){
            if(first[i]<second[j]){
               mergeArr[k]=first[i];
               i++;
            }
            else{
                mergeArr[k]=second[j];
                j++;
            }
            k++;
        }

        //in case of any array (first or second) length is not zero:
        while(i<first.length){
            mergeArr[k]=first[i];
            i++;
            k++;
        }
        while(j<second.length){
            mergeArr[k]=second[j];
            j++;
            k++;
        }

        return mergeArr;
    }

    public static void main(String[] args) {
        int[] arr={8,3,4,12,5,6};
        arr=mergeSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
