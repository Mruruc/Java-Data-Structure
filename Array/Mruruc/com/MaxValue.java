package Mruruc.com;

import java.util.Arrays;

public class MaxValue {

    public static int maxValue(int[] arr){
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }return max;
    }
    public static void main(String[] args) {
        int[] arr={2,6,8,1,88,91};
        System.out.println(Arrays.toString(arr));
        int max=maxValue(arr);
        System.out.println(max);
    }
}
