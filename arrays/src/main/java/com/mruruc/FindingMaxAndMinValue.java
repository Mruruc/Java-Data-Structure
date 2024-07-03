package com.mruruc;

public class FindingMaxAndMinValue {

    public static int maxValue(int[] arr){
        int maxValue =arr[0];
        for(int element: arr) if (element> maxValue) maxValue = element;
        return maxValue;
    }
    public static int minValue(int[] arr){
        int minValue =arr[0];
        for(int element: arr) if(element <minValue) minValue = element;
        return minValue;
    }

    public static void main(String[] args) {
        int[] arr={2,6,8,1,88,91,-5654};
        System.out.println("Min Value: "+minValue(arr));
        System.out.println("Max Value: " + maxValue(arr));
    }
}
