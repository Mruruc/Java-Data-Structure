package com.Mruruc.SearchingAlgorithm.BinarySearch;


public class BinarySearch {


    public static int binarySearch(int[] arr, int element) {

        if (arr.length <= 0) {
            return -1;
        }
        int indexStart = 0;
        int indexLast = arr.length - 1;


        //for Ascending order:
        if (arr[indexStart] < arr[indexLast]) {
            while (indexStart <= indexLast) {
                int indexMiddle = indexStart + (indexLast - indexStart) / 2;

                if (element == arr[indexMiddle]) {
                    return indexMiddle;
                } else if (element > arr[indexMiddle]) {
                    indexStart = indexMiddle + 1;
                } else {
                    indexLast = indexMiddle - 1;
                }
            }
            //for Descending order:
        } else {
            while (indexStart <= indexLast) {
                int indexMiddle = indexStart + (indexLast - indexStart) / 2;

                if (element == arr[indexMiddle]) {
                    return indexMiddle;
                } else if (element > arr[indexMiddle]) {
                    indexLast = indexMiddle - 1;
                } else {
                    indexStart = indexMiddle + 1;
                }
            }
        }
        return -1;
    }

}


