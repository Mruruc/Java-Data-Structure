package com.Mruruc.Algorithm;

public class CountingNoOfDigit {

    public static int count(int num,int digit){
        int counter = 0;
        while(num!=0){
            int rem=num%10;
            if(rem==digit){
                counter++;
            }
            num=num/10;
        }
        return counter;
    }
}
