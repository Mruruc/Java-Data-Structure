package com.Mruruc.SearchingAlgorithm.Linear_Search_Algorithm;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class SearchInRange {
    public static boolean searchInRange(int[] arr,int element,int firstIndex,int lastIndex){
        if(arr.length<=0){
            return false;
        }
        for (int i = firstIndex; i <=lastIndex; i++) {
            if(arr[i]==element){
                return true;
            }
            if((i<firstIndex || i> lastIndex) && arr[i]==element){
                System.out.println("Element is exist but not in Range:"+element );
                return false;
            }
        }
        return false;
    }
    @Test
    public void test(){
        int[] arr={12,3,5,9,17};
        int element=5;
        int firstIndex=1;
        int lastIndex=3;
        assertTrue(SearchInRange.searchInRange(arr,element,firstIndex,lastIndex));
        int element2=20;
        assertFalse(SearchInRange.searchInRange(arr,element2,firstIndex,lastIndex));

        // test case: range is out of bounds
        int element6 = 9;
        int firstIndex6 = 3;
        int lastIndex6 = 1;
        assertFalse(SearchInRange.searchInRange(arr, element6, firstIndex6, lastIndex6));

    }
}
