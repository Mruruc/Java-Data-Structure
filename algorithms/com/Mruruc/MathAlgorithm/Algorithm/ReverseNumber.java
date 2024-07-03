package com.Mruruc.Algorithm;

public class ReverseNumber {
    public static int reverseNumber(int number) {
        int num=0;
        int sign = 1;

        if(number < 0){
            sign = -1;
            number = -number;
        }

        while(number > 0){
            num = num*10 + number%10;
            number = number/10;
        }

        return num * sign;

    }
}
