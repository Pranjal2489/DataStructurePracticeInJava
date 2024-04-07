package DynamicProgramming;

import java.util.Arrays;

public class MatrixChainMulti {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,3};
        int n= arr.length;
        int i=1,j=n-1;
        System.out.println("Min OPerations: "+mcmMemo(arr,i,j));
//        System.out.println("Min OPerations: "+mcm(arr,i,j));
    }

    private static int mcmMemo(int[] arr, int i, int j) {
        int n= arr.length;
        int[][] dp=new  int[n][n];
        for (int[] row:dp){
            Arrays.fill(row,-1);
        }
        return mcmMemoHelper(arr,i,j,dp);
    }

    private static int mcmMemoHelper(int[] arr, int i, int j, int[][] dp) {
        if (i==j) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int minOpr=Integer.MAX_VALUE;
        for (int k = i; k < j; k++) {
            int operations=mcmMemo(arr,i,k)+mcmMemo(arr, k+1, j)+arr[i-1]*arr[k]*arr[j];
            minOpr=Math.min(operations,minOpr);
        }
        dp[i][j]=minOpr;
        return minOpr;
    }

    private static int mcm(int[] arr, int i, int j) {
        //base case
        if (i==j) return 0;
        int minOpr=Integer.MAX_VALUE;
        for (int k = i; k < j; k++) {
            int operations=mcm(arr,i,k)+mcm(arr, k+1, j)+arr[i-1]*arr[k]*arr[j];
            minOpr=Math.min(operations,minOpr);
        }return minOpr;
    }
}
