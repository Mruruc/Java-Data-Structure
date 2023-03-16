package com.Mruruc;

public class Pattern {

    public static void pattern1(int n){
    /*   *
         **
         ***
         ****
         *****  */
        for (int row = 1; row <=n; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print("*");
            }System.out.println();
        }
    }
    public static void pattern2(int n){
        /*
         *****
         ****
         ***
         **
         *   */
        for (int row = 1; row<=n; row++) {
            for (int col = 1; col <=n-row+1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n) {
     /*
         *
         **
         ***
         ****
         *****
         *****
         ****
         ***
         **
         *
            */
        for (int row = 1; row <=n; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print("*");
            }System.out.println();
        }
        for (int row = 1; row<=n; row++) {
            for (int col = 1; col <=n-row+1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private static void pattern4(int n) {
        /*
         *****
         *****
         *****
         *****
         *****
         */
        for (int row = 1; row <=n; row++) {
            for (int col = 1; col <=n ; col++) {
                System.out.print("*");
            }System.out.println();
        }
    }
    private static void pattern5(int n) {
        /*
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
        */
        for (int row = 1; row <=n; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print(col+" ");
            }System.out.println();
        }
    }

    private static void pattern6(int height) {
       /*    *
            ***
           *****
          *******
         *********  */
        // Loop through each row of the pyramid
        for (int row = 1; row <= height; row++) {
            // Print spaces before the first asterisk on this row
            for (int space = 1; space <= height - row; space++) {
                System.out.print("#");
            }

            // Print the asterisks for this row
            for (int asterisk = 1; asterisk <= (2 * row - 1); asterisk++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }
    private static void pattern7(int height) {
     /* *********
         *******
          *****
           ***
            *   */

        // Loop through each row of the pyramid
        for (int row = 1; row <= height; row++) {
            // Print spaces before the first asterisk on this row
            for (int space = 1; space < row; space++) {
                System.out.print(" ");
            }

            // Print the asterisks for this row
            for (int asterisk = 1; asterisk <= (2 * (height - row + 1) - 1); asterisk++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
    }

    private static void pattern8(int n) {
        /*5 5 5 5 5 5 5 5 5 5 5
         5 4 4 4 4 4 4 4 4 4 5
         5 4 3 3 3 3 3 3 3 4 5
         5 4 3 2 2 2 2 2 3 4 5
         5 4 3 2 1 1 1 2 3 4 5
         5 4 3 2 1 0 1 2 3 4 5
         5 4 3 2 1 1 1 2 3 4 5
         5 4 3 2 2 2 2 2 3 4 5
         5 4 3 3 3 3 3 3 3 4 5
         5 4 4 4 4 4 4 4 4 4 5
         5 5 5 5 5 5 5 5 5 5 5 */
        int originalN = n;
        n = 2 * n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = originalN - Math.min(Math.min(row, col), Math.min(n - row, n - col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
}
