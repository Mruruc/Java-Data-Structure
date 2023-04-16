package com.Mruruc.Test;

import com.Mruruc.Algorithm.DecimalToBinary;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecimalToBinaryTest {

    @Test
    public void decimal_To_Binary_Test(){
        assertEquals(String.valueOf(100101), DecimalToBinary.decimal(37));
    }
}
