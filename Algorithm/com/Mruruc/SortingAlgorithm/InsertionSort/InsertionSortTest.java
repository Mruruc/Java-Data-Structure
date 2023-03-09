package com.Mruruc.SortingAlgorithm.InsertionSort;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class InsertionSortTest {

    @Test
    public void testInsertionSort() {
        int[] arr = { 5, 2, 8, 3, 1, 6 };
        InsertionSort.insertionSort(arr);
        int[] expected = { 1, 2, 3, 5, 6, 8 };
        assertArrayEquals(expected, arr);
    }
    @Test
    public void tesNegativeNumber(){
        int[] arr={-5,8,6,-1,2,0};
        InsertionSort.insertionSort(arr);
        int[] expected={-5,-1,0,2,6,8};
        assertArrayEquals(expected,arr);
    }


}
