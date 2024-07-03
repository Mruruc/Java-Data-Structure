package com.Mruruc.Test;
import com.Mruruc.Algorithm.ReverseNumber;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseNumberTest {

    @Test
    public void rnt(){

        assertEquals(4321,ReverseNumber.reverseNumber(1234));
        assertEquals(0, ReverseNumber.reverseNumber(0));
        assertEquals(1, ReverseNumber.reverseNumber(1000));
        assertEquals(-1234, ReverseNumber.reverseNumber(-4321));
        assertEquals(-1, ReverseNumber.reverseNumber(-1000));
    }
}