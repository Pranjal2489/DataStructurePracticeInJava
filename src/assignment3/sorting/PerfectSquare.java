package assignment3.sorting;

import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number ?");
        int n=scanner.nextInt();
        boolean res=isPerfectSquare(n);
        System.out.println(res);
    }
    public static boolean isPerfectSquare(int x){
        boolean flag=false;
        int low =0,high=x;
        while (low<=high){
            int mid=low+(high-low)/2;
            long val=mid*mid;
            if (val==x){
                flag=true;
                return flag;
            }else if (val>x){
                high=mid-1;
            }else {
                low=mid+1;
            }

        }
        return  flag;
    }
}
