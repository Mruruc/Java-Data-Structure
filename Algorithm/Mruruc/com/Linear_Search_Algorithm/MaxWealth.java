package Mruruc.com.Linear_Search_Algorithm;

public class MaxWealth {

    public static int maxWealth(int [][] arr,int accountNumber){
        int[] sumArray=new int[accountNumber];
        int sum=0;
        for (int account= 0;account <arr.length ; account++) {
            for (int person = 0; person < arr[account].length; person++) {
                 sum=sum+arr[account][person];
            }
            sumArray= addElement(sum);
        }
        return maxElement(sumArray);
    }
    public static int maxElement(int [] arr){
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }


    public static int[] addElement(int element) {

        int index=0;
        int[] arr = new int[index+1];
        arr[index] = element;
        index++;
        return arr;
    }

    public static void main(String[] args) {
        int [][] arr={{1,2,34},
                      {1,3,5},
                      {3,5,9}};
        System.out.println(maxWealth(arr,3));

    }
}
