package com.Mruruc.Test;

import com.Mruruc.Algorithm.BinaryToDecimal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryToDecimalTest {

    @Test
    public void binary_To_Decimal(){
        assertEquals(37, BinaryToDecimal.binary1(100101));
    }
    @Test
    public void binary_To_Decimal_test_zero(){
        assertEquals(0, BinaryToDecimal.binary1(0));
    }
    @Test
    public void binary_To_Decimal_test_one(){
        assertEquals(1, BinaryToDecimal.binary1(1));
    }
}
