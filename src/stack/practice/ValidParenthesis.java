package stack.practice;

import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the String ");
        String str= scanner.nextLine();
        System.out.println("Is the given Parenthesis valid?");
        System.out.println(isValid(str));

    }

    private static boolean isValid(String str) {
        Stack<Character> stack1=new Stack<>();
        char[] chars=str.toCharArray();

        if (chars.length==0){
            return  false;
        }
        for (char ele : chars){
            if (ele=='(' || ele=='{' || ele=='['){
                stack1.push(ele);
                continue;
            }
            else if (stack1.empty() ){
                return false;
            }

            char top=stack1.pop();


            if (top=='('&& ele!=')' ||top=='{'&& ele!='}' ||top=='['&& ele!=']'){
                return false;
            }
        }
        return stack1.empty();
    }

}
