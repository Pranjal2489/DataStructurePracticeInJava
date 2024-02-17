package recursion.dsamodule;

import java.util.Scanner;

public class Fabonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the index number you want fibonacci of? ");
        int n=sc.nextInt();
        int res =findFabo(n);
        System.out.println(res);
    }

    private static int findFabo(int n) {
        if (n==0 || n==1){
            return n;
        }
        else {
            return findFabo(n-1)+findFabo(n-2);
        }
    }
}
