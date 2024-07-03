package com.Mruruc.Test;
import  com.Mruruc.Algorithm.QuadraticEquation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuadraticEquationTest{
    @Test
    void testEquation_noRealRoots() {
        String result = QuadraticEquation.equation(1, 2, 2);
        assertEquals("There is no reel root !", result);
    }

    @Test
    void testEquation_equalRealRoots() {
        String result = QuadraticEquation.equation(1, -2, 1);
        assertEquals("1", result);
    }

    @Test
    void testEquation_twoDifferentRealRoots() {
        String result = QuadraticEquation.equation(1, -3, 2);
        assertEquals("2    1", result);
    }
}
