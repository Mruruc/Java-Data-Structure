package Java_Collections;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {

    public static void BinaryNumber() {
        Stack<Integer> stack=new Stack<>();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number:");
        int decimal=scan.nextInt();
        while(decimal !=0){
            int reminder=decimal % 2;
            stack.push(reminder);
            decimal=decimal/2;
        }
         while(!stack.isEmpty()){
            System.out.print( stack.pop());
        }
    }

    public static void main(String[] args) {
        DecimalToBinary.BinaryNumber();
    }

}
