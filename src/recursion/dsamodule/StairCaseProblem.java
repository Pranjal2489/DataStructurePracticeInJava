package recursion.dsamodule;

import java.util.Scanner;

public class StairCaseProblem {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of stairs? ");
        int m=scan.nextInt();
        int res=findWays(m+1);
        System.out.println("The number of ways are "+ res);
    }

    private static int findWays(int n) {
        int result;
        if(n<=1){
            return n;
        }else {
            result= findWays(n-1)+findWays(n-2);
        }
        return result;
    }
}
