package com.Mruruc.SortingAlgorithm.SelectionSort;


public class SelectionSort {

    public static void selectionSort(int[] arr){

        for (int i = 0; i < arr.length ; i++) {
            int lastIndex=arr.length-1-i;
            int maxIndex=getMaxIndex(arr,0,lastIndex);
            swap(arr,maxIndex,lastIndex);
        }
    }

    private static void swap(int[] arr, int maxIndex, int lastIndex) {
        int temp=arr[maxIndex];
        arr[maxIndex]=arr[lastIndex];
        arr[lastIndex]=temp;
    }

    public static int getMaxIndex(int[] array, int startIndex, int endIndex) {
        // Set the initial maximum value index to the starting index
        int maxIndex = startIndex;

        // Loop through the array from the starting index to the ending index
        for (int i = startIndex; i <= endIndex; i++) {
            // If the current element is greater than the maximum element, update the maximum index
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }
        // Return the index of the maximum element within the given range
        return maxIndex;
    }


}
