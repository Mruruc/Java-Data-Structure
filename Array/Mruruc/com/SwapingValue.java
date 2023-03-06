package Mruruc.com;

import java.util.Arrays;

public class SwapingValue {
    public static void main(String[] args) {
        int[] arr={2,6,8,1,88,91};
        System.out.println(Arrays.toString(arr));
        swap(arr,3,5);
        System.out.println(Arrays.toString(arr));

    }
    public static void swap(int [] arr,int firstIndex,int secondIndex){
        int temp=arr[firstIndex];
        arr[firstIndex]=arr[secondIndex];
        arr[secondIndex]=temp;
    }
}
