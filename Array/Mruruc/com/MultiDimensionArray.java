package Mruruc.com;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArray {
    public static void main(String[] args) {
        /* Two Dimension Array: we can assume that is array of array;
         dataType [][] arrayName=new dataType[necessary-length][unnecessary-length];
         */


        int[][] array2D = {{1, 2, 3},
                {4, 5, 6},
                {8, 9, 10, 11}};
        print2DArray(array2D);


        //fill 2D array With input;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int length = scan.nextInt();
        int[][] two2DArray = new int[length][3];

        for (int i = 0; i < two2DArray.length; i++) {
            for (int j = 0; j < two2DArray[i].length; j++) {
                System.out.println("Enter element at the index" + i + "-" + j);
                two2DArray[i][j] = scan.nextInt();
            }
        }
        print2DArray(two2DArray);


        //Declaration of Two Dimension String Array;
        String[][] two2DStringArray = new String[3][];

        //print 2D array with Arrays.toString() method:
        for (int i = 0; i < two2DStringArray.length; i++) {
            System.out.println(Arrays.toString(two2DStringArray));
        }


    }

    //printing Two Dimension Array;

    public static void print2DArray(int[][] o) {

        for (int i = 0; i < o.length; i++) {
            for (int j = 0; j < o[i].length; j++) {
                System.out.print(o[i][j] + " ");
            }
            System.out.println();
        }
    }
}
