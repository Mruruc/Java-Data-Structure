package com.Mruruc.SortingAlgorithm.BubbleSort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BubbleSortTest {

    @Test
    public void testForNegativeNumber() {
        int[] arr = {-8, 6, 13, 1, -9, 0};
        int[] expected = {-9, -8, 0, 1, 6, 13};
        BubbleSort.bubbleSortASC(arr);
        assertArrayEquals(expected,arr);
    }

    @Test
    public void testBubbleSortASC() {
        int[] arr = {5, 1, 4, 2, 8};
        int[] expected = {1, 2, 4, 5, 8};
        BubbleSort.bubbleSortASC(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testBubbleSortDESC() {
        int[] arr = {5, 1, 4, 2, 8};
        int[] expected = {8, 5, 4, 2, 1};
        BubbleSort.bubbleSortDESC(arr);
        assertArrayEquals(expected, arr);
    }

}
