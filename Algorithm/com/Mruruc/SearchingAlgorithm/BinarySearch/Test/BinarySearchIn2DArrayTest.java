package com.Mruruc.SearchingAlgorithm.BinarySearch.Test;

import com.Mruruc.SearchingAlgorithm.BinarySearch.BinarySearchIn2DArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

 class BinarySearch2DTest {

        @Test
        void testBinarySearch2D() {
            int[][] arr = {
                    {1, 3, 5, 7},
                    {2, 4, 6, 8},
                    {9, 10, 11, 12},
            };

            // Element present in the array
            int[] expected1 = {0, 2};
            Assertions.assertArrayEquals(expected1, BinarySearchIn2DArray.binarySearch2D(arr, 5));

            // Element not present in the array
            int[] expected2 = {-1, -1};
            Assertions.assertArrayEquals(expected2, BinarySearchIn2DArray.binarySearch2D(arr, 13));

            // Empty array
            int[][] emptyArr = {};
            int[] expected3 = {-1, -1};
            Assertions.assertArrayEquals(expected3,  BinarySearchIn2DArray.binarySearch2D(emptyArr, 1));
        }
    }


