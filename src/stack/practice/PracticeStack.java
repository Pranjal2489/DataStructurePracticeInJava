package stack.practice;

import java.util.Stack;

public class PracticeStack {
    public static void main(String[] args) {
        Stack<Integer> stack1=new Stack<>();
        stack1.push(2);
        stack1.push(4);
        stack1.push(6);
        stack1.push(9);
        System.out.println(stack1);

        System.out.println(stack1.peek());

        stack1.pop();
        System.out.println(stack1.peek());

        System.out.println("Element is present at position "+ stack1.search(4));
        System.out.println("Element is present at position "+ stack1.search(11));
        System.out.println(stack1.empty());

    }
}
