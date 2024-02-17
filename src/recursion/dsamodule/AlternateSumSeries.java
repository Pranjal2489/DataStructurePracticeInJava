package recursion.dsamodule;

import java.util.Scanner;

public class AlternateSumSeries {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number ? ");
        int m=scan.nextInt();
        int res=alternateSum(m);
        System.out.println("The alternate sum is : "+ res);
    }

    private static int alternateSum(int num) {
        if(num==0){
            return 0;
        }else {
            if (num%2==0){
                return alternateSum(num-1)-num;
            }
            else {
                return alternateSum(num-1)+num;
            }
        }
    }
}
