package com.Mruruc.Algorithm;

public class BinaryToDecimal {

    public static int binary(long binary){

        String[] decimal= String.valueOf(binary).trim().split("");
        int power=0;
        int sum=0;
        for (int i = decimal.length-1; i>=0; i--,power++) {

            int pow=(int)Math.pow(2,power);
            sum = sum + pow * (Integer.parseInt(decimal[i]));

        }
        return sum;
    }

   public static long binary1(long binary) {
        long decimal=0;
        int pow;
        int power=0;
        while(binary>0){
            long reminder= binary % 10;
            pow=(int)Math.pow(2,power);
            decimal=decimal+(reminder *pow);
            power++;
            binary=binary/10;

        }
        return decimal;
    }

}
