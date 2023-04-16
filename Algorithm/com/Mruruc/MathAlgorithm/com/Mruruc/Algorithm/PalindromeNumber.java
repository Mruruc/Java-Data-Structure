package com.Mruruc.Algorithm;

public class PalindromeNumber {

    public static boolean palindrome(int num){
        int reversed=0;
        int originalValue=num;
        while(num!=0){
            int rem=num%10;
            reversed=reversed*10+rem;
            num=num/10;
        }
        if(originalValue==reversed){
            return true;
        }
        return false;
    }

}
