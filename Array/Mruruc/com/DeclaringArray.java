package Mruruc.com;
import Mruruc.com.PrintArray;
public class DeclaringArray {

    public static void main(String[] args) {
        /*
        dataType [] name=new dataType[length of array];
        */
        int[] intArray=new int[7];
        String[] stringArray=new String[2];
        char[] charArray=new char[3];

        PrintArray.printIntArray(intArray);
        System.out.println("=============");
        PrintArray.printStringArray(stringArray);
        System.out.println("==============");
        PrintArray.printCharArray(charArray);
    }
}
