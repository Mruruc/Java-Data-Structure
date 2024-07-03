package Java_Collections;

import java.util.Stack;

public class MyStack {
   public static void main(String[] args) {

      //The stack is a linear data structure that is used to store the collection of objects.
      //! it is based on LAST-IN-FIRST-OUT(LIFO).
      //The most important operations are a pop and push.
      //if the stack has no element its known as Empty stack, when the stack is empty the value of the top variable is-1.

      //Stack class extends from Vector class.
      //its implements List,Collection,Iterable,Cloneable and Serializable interface.

      //Since it implements these interface and extends from Vector class,it can implement this class and these interface methods.

                             //Methods;
      Stack<Integer>stack=new Stack<>();

      //Push(Object o)---->> it pushes an element onto the top of element,and the top is increased by 1;
      stack.push(2);
      stack.push(4);
      stack.push(6);
      System.out.println(stack);

      //pop()--->>> removes and returns the element at the top of stack and the value of top is decreased by1,
      //if stack is empty,it throws the EmptyStackException;

      stack.pop();
      System.out.println(stack);

      //peek()--->> returns the element at the top of stack,if stack is empty,it throws the EmptyStackException;
      System.out.println(stack.peek());

      //empty()---->> return true if the stack is empty,false otherwise;
      System.out.println(stack.empty());

      //search(Object o)---->>>returns the position of element in the stack if element is not in the stack is return -1;
      System.out.println(stack.search(2));
      System.out.println(stack.search(0));
      System.out.println(stack.size());






   }
}
