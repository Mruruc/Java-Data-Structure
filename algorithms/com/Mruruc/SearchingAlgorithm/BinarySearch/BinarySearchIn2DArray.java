package com.Mruruc.SearchingAlgorithm.BinarySearch;

public class BinarySearchIn2DArray {

    public static int[] binarySearch2D(int[][] arr, int element) {

        int row = 0;
        int column = arr[0].length - 1;

        while (row < arr.length && column >= 0) {
            if (arr[row][column] == element) {
                return new int[]{row, column};
            }
            if (arr[row][column] < element) {
                row++;
            } else {
                column--;
            }
        }
        return new int[]{-1, -1};
    }

}
