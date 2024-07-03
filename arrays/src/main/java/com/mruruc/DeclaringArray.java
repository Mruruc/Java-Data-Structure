package com.mruruc;

public class DeclaringArray {

    public static void main(String[] args) {
        /*
        dataType [] name=new dataType[length of array];
        */
        int[] intArray=new int[7];
        intArray[0] = 21;

        String[] stringArray=new String[2];
        stringArray[0] = "Zero Index";
        char[] charArray=new char[3];
        charArray[0] = 'A';

       // printArray(stringArray);
        System.out.println("=============");
//        printArray(intArray);
        printArray(charArray);

    }



    static <T> void printArray(T[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    static void printArray(char[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
