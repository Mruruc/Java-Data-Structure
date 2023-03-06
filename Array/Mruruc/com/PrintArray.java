package Mruruc.com;

import org.jetbrains.annotations.NotNull;

public class PrintArray {

    public static void printIntArray(int @NotNull [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public static void printStringArray(String @NotNull [] arr){
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    public static void printCharArray(char@NotNull[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
}
