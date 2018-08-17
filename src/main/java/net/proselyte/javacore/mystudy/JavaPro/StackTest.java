package net.proselyte.javacore.mystudy.JavaPro;

//Stack is a subclass of Vector
// that implements a standard last-in, first-out stack.

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // 5 --> 4 --> 2 -->
        stack.push(5);
        stack.push(4);
        stack.push(2);

        while(!stack.empty()){
            System.out.print(stack.pop() + "-->");  //2-->4-->5-->
        }
    }
}
