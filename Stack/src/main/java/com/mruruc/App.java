package com.mruruc;

public class App {
    public static void main(String[] args) {
        // noon
        char[] charArray = "noon".toCharArray();
        Stack<Character> stack = new Stack<>(10);
        for (int i = 0; i <charArray.length; i++) {
            if (stack.isEmpty()){
                stack.push(charArray[i]);
            }
            else if (stack.peek() == charArray[i]) {
                stack.pop();
            }
            else {
                stack.push(charArray[i]);
            }
        }
        System.out.println(stack.isEmpty());
//        stack.push("John");
//        stack.push("Jane");
//        stack.push("Marry");
//        stack.push("Bob");
//        stack.push("Hanna");
//        stack.push("Barny");
//        System.out.println(stack);
//
//        stack.pop();
//        System.out.println(stack);

    }
}
