package com.mruruc;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr={7,9,3,2,6};
        QuickSort.sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
