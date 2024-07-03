package com.Mruruc.SearchingAlgorithm.BinarySearch.Test;

import com.Mruruc.SearchingAlgorithm.BinarySearch.BinarySearch;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class BinarySearchTest {


    @Test
    public void testBinarySearchEmptyArray() {
        int[] arr = {};
        Assert.assertEquals(-1, BinarySearch.binarySearch(arr, 0));
        assertEquals(-1,BinarySearch.binarySearch(arr, 1));
        assertEquals(-1,BinarySearch.binarySearch(arr, -1));
    }

    @Test
    public void testBinarySearchSingleElement() {
        int[] arr = {5};
        assertEquals(0, BinarySearch.binarySearch(arr, 5));
        assertEquals(-1, BinarySearch.binarySearch(arr, 4));
        assertEquals(-1, BinarySearch.binarySearch(arr, 6));
    }

    @Test
    public void testBinarySearchAscendingArray() {
        int[] arr = {1, 3, 5, 7, 9};
        assertEquals(2,BinarySearch.binarySearch(arr, 5));
        assertEquals(-1,BinarySearch.binarySearch(arr, 6));
        assertEquals(0, BinarySearch.binarySearch(arr, 1));
        assertEquals(4, BinarySearch.binarySearch(arr, 9));
        assertEquals(-1,BinarySearch.binarySearch(arr, 0));
        assertEquals(-1,BinarySearch.binarySearch(arr, 10));
    }

    @Test
    public void testBinarySearchDescendingArray() {
        int[] arr = {9, 7, 5, 3, 1};
        assertEquals(2, BinarySearch.binarySearch(arr, 5));
        assertEquals(-1, BinarySearch.binarySearch(arr, 6));
        assertEquals(0, BinarySearch.binarySearch(arr, 9));
        assertEquals(4, BinarySearch.binarySearch(arr, 1));
        assertEquals(-1, BinarySearch.binarySearch(arr, 0));
        assertEquals(-1, BinarySearch.binarySearch(arr, 10));
    }

}
