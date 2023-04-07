package com.Mruruc;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int[] arr={1,5,6,9,10,10};
        int rs=RotatedBinarySearch.search(arr,10,0,arr.length-1);
        System.out.println(rs);
    }
}
