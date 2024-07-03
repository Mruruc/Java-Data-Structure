package com.Mruruc.Test;

import com.Mruruc.Algorithm.PalindromeNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeNumberTest {

    @Test
    public void testPalindrome(){
        assertTrue(PalindromeNumber.palindrome(1221));
        assertFalse(PalindromeNumber.palindrome(1234));
    }
}
