package com.Mruruc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestGCD {

    @Test
    public void testByModulo(){
        assertEquals(5,GCD.byModule(115,85));
        assertEquals(1,GCD.byModule((int)( Math.pow(10,3)),3));
        assertEquals(1,GCD.byModule((int)( Math.pow(10,6)),3));
        assertEquals(1,GCD.byModule((int)( Math.pow(10,10)),3));
    }

    @Test
    public void testByModule_equal_numbers() {
        int result = GCD.byModule(10, 10);
        assertEquals(10, result);
    }

    public void testBySubstraction() {
        assertEquals(1, GCD.bySubstraction(1000, 3));
        assertEquals(1, GCD.bySubstraction((int) Math.pow(10, 6), 3));
        assertEquals(1, GCD.bySubstraction((int) Math.pow(10, 10), 3));
    }

    @Test
    public void testBySubstraction_equal_numbers() {
        assertEquals(10, GCD.bySubstraction(10, 10));
    }


}
