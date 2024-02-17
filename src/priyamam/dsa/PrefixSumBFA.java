package priyamam.dsa;

import java.util.Scanner;

public class PrefixSumBFA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        byte [][] arr ;
        byte m,n;
        System.out.println("enter the number of rows");
        m=sc.nextByte();
        System.out.println("enter the number of columns");
        n=sc.nextByte();
        arr=new byte[m][n];
        System.out.println("enter the array values");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextByte();
            }
        }
        System.out.println("enter the value of starting row");
        byte r1=sc.nextByte();
        System.out.println("enter the value of starting column");
        byte c1=sc.nextByte();
        System.out.println("enter the value of ending row");
        byte r2=sc.nextByte();
        System.out.println("enter the value of ending column");
        byte c2=sc.nextByte();
        byte res=prefixSum(arr,r1,c1,r2,c2);
        System.out.println(res);



    }

    public static byte prefixSum(byte[][] arr, byte r1, byte c1, byte r2, byte c2) {
        byte sum=0;
        for (int i = r1; i <= r2; i++) {
            for (int j = c1; j <= c2; j++) {
                sum+=arr[i][j];
            }
        }
        return sum;
    }
}
