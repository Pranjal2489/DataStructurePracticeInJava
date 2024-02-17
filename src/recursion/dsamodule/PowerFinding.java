package recursion.dsamodule;

import java.util.Scanner;

public class PowerFinding {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the values of a and b ");
        int a = scan.nextInt();
        int b= scan.nextInt();
        double res=findPower(a,b);
        System.out.println("the result is : "+res);
    }

    private static double findPower(int a, int b) {
        int mid;
        double res;
        double finalRes;
        if (b==1){
            return a;
        }
        else {
            mid=b/2;
            res=findPower(a,mid);
            finalRes=res*res;
            if (b%2==0){
                return finalRes;
            }else {
                return a*finalRes;
            }
        }
    }


}
