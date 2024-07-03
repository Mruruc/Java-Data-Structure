package com.mruruc;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class RotateImage {

    // rotate image 90 degree
    static int[][] rotatingImage(int[][] image) {
        int n = image.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = image[i][j];
                image[i][j] = image[j][i];
                image[j][i] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = image[i][j];
                image[i][j] = image[i][n - 1 - j];
                image[i][n - 1 - j] = temp;
            }
        }

        return image;
    }

    static void printImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                System.out.print(image[i][j] + " ");
            }
            System.out.println();
        }
    }

    static boolean solution(String[] crypt, char[][] solution){
        Map<Character,Character> map = new HashMap<Character,Character>();
        for(char[] arr : solution){
            map.put(arr[0],arr[1]);
        }

        String[] decryptedWords = new String[crypt.length];
        for (int i = 0; i < crypt.length; i++) {
            StringBuilder decryptedString = new StringBuilder();
            for(char c : crypt[i].toCharArray()){
                decryptedString.append(map.get(c));
            }
            decryptedWords[i] = decryptedString.toString();
        }

        for (String word : decryptedWords) {
            if (word.length() > 1 && word.charAt(0) == '0') {
                return false;
            }
        }

        long num1 = Long.parseLong(decryptedWords[0]);
        long num2 = Long.parseLong(decryptedWords[1]);
        long num3 = Long.parseLong(decryptedWords[2]);

        return num1 + num2 == num3;
    }

    public static void main(String[] args) {

//        int[][] image = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        System.out.println("=====Before Rotating Image=====");
//        printImage(image);
//        System.out.println("=====After Rotating Image=====");
//        rotatingImage(image);
//        printImage(image);


    }
}
