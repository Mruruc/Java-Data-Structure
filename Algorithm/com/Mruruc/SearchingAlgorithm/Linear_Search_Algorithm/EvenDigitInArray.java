package com.Mruruc.SearchingAlgorithm.Linear_Search_Algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EvenDigitInArray {

    public static int evenDigitInArray(int[] arr){
        int counter=0;
        for (int i = 0; i<arr.length; i++) {
           counter=counter+evenDigit(arr[i]);
        }
        return counter;
    }

    public static int evenDigit(int number){
        int counter=0;
        if(number==0){
            counter++;
        }
        while(number > 0){
            int rem=number%10;
            number=number/10;
            if(rem % 2==0){
                counter++;
            }
        }
        return counter;
    }

    @Test
    public void test(){
        int [] arr={1,6,88,123,0};
        int expected=5;
        assertEquals(expected,evenDigitInArray(arr));
    }

    public static void main(String[] args) {
        int [] arr={1,6,88,123,0};
        System.out.println(evenDigitInArray(arr));
    }
}
