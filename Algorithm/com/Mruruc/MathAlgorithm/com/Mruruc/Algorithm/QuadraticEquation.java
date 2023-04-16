package com.Mruruc.Algorithm;

public class QuadraticEquation {


    //ax2 + bx + c=0
    public static String equation(int aCoefficient,int bCoefficient,int cCoefficient){
        //find delta
        int delta= (int) Math.pow(bCoefficient,2)-(4 *aCoefficient*cCoefficient);
        if(delta<0){
            return "There is no reel root !";

        } else if (delta==0) {
            System.out.println("There are equal two reel root:");
            int result= -bCoefficient/(2*aCoefficient);
            return String.valueOf(result);
        }
        else {
            System.out.println("There are two different reel root:");
            int x1= (int) ((-bCoefficient + Math.sqrt(delta))/ (2* aCoefficient));
            int x2= (int) ((-bCoefficient - Math.sqrt(delta))/ (2* aCoefficient));
            return x1 +"    "+ x2;
        }


    }
}
