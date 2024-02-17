package recursion.dsamodule;

import java.util.Scanner;

public class PrintMultiples {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number you want table of ? ");
        int m=scan.nextInt();
        System.out.println("Enter how many multiples you want");
        int n=scan.nextInt();
        System.out.println("The multiples are : ");
        findMultiples(m,n);
    }

    private static void findMultiples(int m, int n) {
        if(n==1){
            System.out.println(m);
        }
        else {
            findMultiples(m,n-1);
            System.out.println(m*n);
        }
    }
}
