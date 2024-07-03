package com.Mruruc.SearchingAlgorithm.Linear_Search_Algorithm;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SearchString {

    public static boolean linearSearch(String[] arr, String element) {
        if (arr.length <= 0) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(element)) {
                return true;
            }
        }
        return false;
    }

    @Test
    public void testLinearSearch() {
        String[] arr = {"apple", "banana", "orange", "pear"};
        String element = "orange";
        assertTrue(SearchString.linearSearch(arr,element));
        String element2 = "grape";
        assertFalse(SearchString.linearSearch(arr,element2));
    }
}
