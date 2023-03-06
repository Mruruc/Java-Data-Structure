package Mruruc.com;

import java.util.Arrays;

public class MinValue {

    public static int minValue(int[] arr){
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }return min;
    }

    public static void main(String[] args) {
        int[] arr={2,6,8,1,88,91};
        System.out.println(Arrays.toString(arr));
        int min=minValue(arr);
        System.out.println(min);
    }
}
