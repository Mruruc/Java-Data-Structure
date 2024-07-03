package com.Mruruc.Test;

import com.Mruruc.Algorithm.CountingNoOfDigit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountNoOfDigitTest {

    @Test
    public void testCount(){
        assertEquals(2, CountingNoOfDigit.count(1123,1));
    }
}
