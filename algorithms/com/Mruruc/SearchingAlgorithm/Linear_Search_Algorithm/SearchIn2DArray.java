package com.Mruruc.SearchingAlgorithm.Linear_Search_Algorithm;

public class SearchIn2DArray {
    public static boolean searchIn2d(int[][] arr,int element){
        if(arr.length <=0){
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==element){
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int [][] arr={{1,3,4,58},{0,-5,-24},{-4,8,99}};
        boolean result=searchIn2d(arr,-5);
        System.out.println(result);
        boolean result2=searchIn2d(arr,100);
        System.out.println(result2);
    }
}
