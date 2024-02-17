package assignment4.recursion;

import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter The num you want to check Armstrong or not?");
        int n=scan.nextInt();
        int digits=0;
        int temp=n;
        while (temp>0){
            digits++;
            temp=temp/10;

        }
        if (n==isArmstrong(n,digits)){
            System.out.println("Yes");

        }else
            System.out.println("No");
    }

    private static int isArmstrong(int n, int digits) {
        if(n==0){
            return 0;
        }else{
            return powerFind(n%10,digits)+isArmstrong(n/10,digits);
        }
    }

    private static int powerFind(int a, int b) {
        int result;
        if(b==0){
            return 1;
        }else {
            if(b%2==0){
                 result=powerFind(a,b/2)*powerFind(a,b/2);
            }else {
                result = a * powerFind(a, b / 2) * powerFind(a, b / 2);
            }
            return result;
        }

    }
}
