package searchsort.bitmanipulate;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the value you want square root of ? ");
        int x= scan.nextInt();
        int res=findSquareRoot(x);
        System.out.println("the squared root of "+x+" is "+res);
    }

    private static int findSquareRoot(int x) {
        int low=0,high=x,result=-1;
        while (low<=high){
            int mid=low+(high-low)/2;
            long val= (long) mid *mid;
            if (val==x){
                return mid;
            }else if(val<x){
                result=mid;
                low=mid+1;
            }else {
                high=mid-1;
            }
        }
        return result;
    }
}
