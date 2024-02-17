package assignment4.recursion;

import java.util.Scanner;

public class FindAlternateDigitSum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number upto which you want to find alternate series sum? ");
        int n=scanner.nextInt();
        int res=alternateDigitSum( n);
        System.out.println(" the sum is : "+res);
    }

    private static int alternateDigitSum(int n) {
        if (n==1){
            return 1;
        }else {
            if (n%2==0){
                return alternateDigitSum(n-1)- n;
            }
            else {
                return alternateDigitSum(n-1)+n;
            }
        }
    }
}
