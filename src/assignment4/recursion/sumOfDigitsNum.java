package assignment4.recursion;

import java.util.Scanner;

public class sumOfDigitsNum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number? ");
        int n=scanner.nextInt();
        int res=sumOfDigits( n);
        System.out.println(" the sum is : "+res);

    }

    private static int sumOfDigits(int n) {
        if (n==0){
            return 0;
        }else {
            return n%10+sumOfDigits(n/10);
        }
    }
}
