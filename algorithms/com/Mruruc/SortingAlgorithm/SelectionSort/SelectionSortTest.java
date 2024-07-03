package com.Mruruc.SortingAlgorithm.SelectionSort;

import org.junit.Test;
import static org.junit.Assert.*;

public class SelectionSortTest {

    @Test
    public void testSelectionSort() {
        int[] inputArray = {5, 2, 9, 1, 5, 6};
        int[] expectedOutput = {1, 2, 5, 5, 6, 9};

        SelectionSort.selectionSort(inputArray);

        assertArrayEquals(expectedOutput, inputArray);
    }

    @Test
    public void testSelectionSortEmptyArray() {
        int[] inputArray = {};
        int[] expectedOutput = {};
        SelectionSort.selectionSort(inputArray);
        assertArrayEquals(expectedOutput, inputArray);
    }
    @Test
    public void testSelectionSortSingleElementArray() {
        int[] inputArray = {5};
        int[] expectedOutput = {5};
        SelectionSort.selectionSort(inputArray);
        assertArrayEquals(expectedOutput, inputArray);
    }

    @Test
    public void testSelectionSortDuplicateElements() {
        int[] inputArray = {3, 2, 5, 2, 1};
        int[] expectedOutput = {1, 2, 2, 3, 5};
        SelectionSort.selectionSort(inputArray);
        assertArrayEquals(expectedOutput, inputArray);
    }

    @Test
    public void testSelectionSortNegativeElements() {
        int[] inputArray = {-5, 2, 0, -3, 1};
        int[] expectedOutput = {-5, -3, 0, 1, 2};
        SelectionSort.selectionSort(inputArray);
        assertArrayEquals(expectedOutput, inputArray);
    }



}
