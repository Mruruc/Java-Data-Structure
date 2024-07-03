package com.Mruruc.Algorithm;

public class DecimalToBinary {

    public static String decimal(int decimal){
        String binaryNumber ="";
        while(decimal>1){
            int remainder=decimal%2;
            decimal=decimal/2;
           // binaryNumber=binaryNumber*10+remainder;
            binaryNumber= remainder + binaryNumber;
        }
        return "1"+binaryNumber ;
    }

    public static int decimal2(int decimal) {
    int binaryNumber = 0;
    int multiplier = 1;

    while (decimal > 0) {
        int remainder = decimal % 2;
        decimal = decimal / 2;
        binaryNumber = binaryNumber + (remainder * multiplier);
        multiplier =multiplier * 10;
    }

    return binaryNumber;
}
}
