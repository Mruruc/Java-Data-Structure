package Mruruc.com.Linear_Search_Algorithm;

public class LinearSearch {

    //search in array an item when its found return index of it:
    //otherwise -1:
    public static boolean linearSearch(int[] arr,int element){
        if(arr.length<=0){
            return false;
        }
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]==element){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [] arr={1,3,6,9,10};
        boolean resultFirstCase=linearSearch(arr,10);
        System.out.println(resultFirstCase);
        boolean resultLastCase=linearSearch(arr,0);
        System.out.println(resultLastCase);

    }
}
