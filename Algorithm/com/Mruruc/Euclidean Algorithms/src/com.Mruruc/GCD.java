package com.Mruruc;


public class GCD {

    //Greatest common divisor;

     public static int byModule(int dividend,int divisor){
         if(dividend<0 || divisor< 0){
             throw new IllegalArgumentException("The numbers can not be negative !");
         }
         if(dividend==divisor){
             System.out.println("Numbers are equal !");
             return dividend;
         }

         while(divisor!= 0){
           int reminder=dividend%divisor;
            dividend=divisor;
            divisor=reminder;
        }
         return dividend;
    }

    public static int bySubstraction(int dividend,int divisor) {

        if(dividend<0 || divisor<0){
            throw new IllegalArgumentException("The numbers can not be negative !");
        }
        if(dividend==divisor){
            System.out.println("The numbers are equals !");
            return dividend;
        }
        while (dividend != divisor) {
            if (dividend > divisor) {
                dividend = dividend - divisor;
            } else {
                divisor = divisor - dividend;
            }
        }
        return dividend;
     }


}
