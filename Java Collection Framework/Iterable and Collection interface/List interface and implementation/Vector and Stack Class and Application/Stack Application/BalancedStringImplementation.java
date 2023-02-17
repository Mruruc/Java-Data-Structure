package Java_Collections;

import java.util.Stack;

public class BalancedStringImplementation {
    public static void main(String[] args) {

                String balancedString = "{[()()]}";
                String unbalancedString = "{[(])}";
                String str="{[]}";


                boolean isBalanced1 = BalancedStringChecker.isBalanced(balancedString);
                boolean isBalanced2 = BalancedStringChecker.isBalanced(unbalancedString);

                System.out.println("Is " + balancedString + " balanced? " + isBalanced1);
                System.out.println("Is " + unbalancedString + " balanced? " + isBalanced2);


                Stack stack=new Stack();
        System.out.println(stack.pop());

    }
}
