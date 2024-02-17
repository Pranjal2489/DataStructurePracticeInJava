package priyamam.dsa;

import java.util.Scanner;



public class PrefixSumOA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][] arr ;
        int m,n;
        System.out.println("enter the number of rows");
        m=sc.nextInt();
        System.out.println("enter the number of columns");
        n=sc.nextInt();
        arr=new int[m][n];
        System.out.println("enter the array values");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter the value of starting row");
        int r1=sc.nextInt();
        System.out.println("enter the value of starting column");
        int c1=sc.nextInt();
        System.out.println("enter the value of ending row");
        int r2=sc.nextInt();
        System.out.println("enter the value of ending column");
        int c2=sc.nextInt();

        prefixSum(arr);
        int res=regionSum(arr,r1,c1,r2,c2);
        System.out.println(res);



    }
    public static void prefixSum(int[][] arr){
        // rowwise sum
        int m=arr.length;
        int n=arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 1; j < n; j++) {
                arr[i][j]+=arr[i][j-1];
            }
        }
        //column wise prefix sum

        for (int j = 0; j < n; j++) {
            for (int i = 1; i < m; i++) {
                arr[i][j]+=arr[i-1][j];
            }
        }

    }

    private static int regionSum(int[][] arr, int r1, int c1, int r2, int c2) {
        int sum=0;
        int up=0;
        int left=0;
        int commonRegion=0;
        sum=arr[r2][c2];
        up=arr[r1-1][c2];
        left=arr[r2][c1-1];
        commonRegion=arr[r1-1][c1-1];
        int result= sum-up-left+commonRegion;
        return  result;
    }


}
