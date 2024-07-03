package com.mruruc;

public class CommonStackInterviewQuestion {

    public static  <T> boolean balancedCharacters(T object){
        char[] charArray = String.valueOf(object).toCharArray();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < charArray.length; i++) {
            if(stack.isEmpty() || reverseChar(stack.peek()) != charArray[i]){
                stack.push(charArray[i]);
            }else {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    static char reverseChar(char c){
        if(c == '{'){
            return '}';
        } else if (c == '[') {
            return ']';
        } else if (c == '(') {
            return ')';
        }
        else return '?';
    }

    public static void main(String[] args) {
        System.out.println(balancedCharacters("[{()}]"));
    }
}
