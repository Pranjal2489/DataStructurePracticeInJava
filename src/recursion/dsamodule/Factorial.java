package recursion.dsamodule;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number you want factorial of?");
        int n=sc.nextInt();
        int res=findFact(n);
        System.out.println("the factorial of "+n+" is : "+res);

    }

    private static int findFact(int num) {
        int res=0;
        if(num==0 || num==1){
            return  1;
        }else {
            res=  num* findFact(num-1);
        }
        return res;
    }
}
