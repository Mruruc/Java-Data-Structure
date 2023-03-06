package Mruruc.com;

import java.util.Scanner;

public class FillArrayWithInput {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int length=scan.nextInt();
        int[] arr=new int[length];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter "+i+" Element:");
            arr[i]= scan.nextInt();
        }

        System.out.println("Elements:");
        PrintArray.printIntArray(arr);
    }
}
