package DynamicProgramming;


public class Knapsack01Problem {
    public static void main(String[] args) {
        int [] profit={1,2,5,6};
//                {60,100,120};
        int [] weight ={2,3,4,5};
//                {10,20,30};

        int m=8;
//        50;
        int n= profit.length;

        System.out.println("Maximum profit of a given knapsack is : "+knapSackTabu(m,profit,weight,n));
    }

    private static int knapSackTabu(int m, int[] profit, int[] weight, int n) {
        int[][] dp=new int[n+1][m+1];
        for (int i = 0; i <= n; i++) {
            for (int w = 0; w <=m; w++) {
                if (i==0||w==0){
                    dp[i][w]=0;

                } else if (weight[i-1]<=w) {
                    dp[i][w]=Math.max(dp[i-1][w],profit[i-1]+dp[i-1][w-weight[i-1]]);
                }
                else dp[i][w]=dp[i-1][w];
            }
        }return dp[n][m];
    }

    //Recursive Approach
    private static int knapsack(int m, int[] profit, int[] weight, int n) {
        if (m==0||n==0) return 0;
        //recursive function call
        if (weight[n-1]>m){
            return knapsack(m,profit,weight,n-1);
        }
        else  return Math.max(knapsack(m,profit,weight,n-1),profit[n-1]+knapsack((m-weight[n-1]),profit,weight,n-1));
    }

    //memoization-helper function
    private static int helper(int m, int[] profit, int[] weight, int n) {
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                dp[i][j] = -1;
            }
        }return  knapsackMemo(m,profit,weight,n,dp);
    }
//Memoization
    private static int knapsackMemo(int m, int[] profit, int[] weight, int n, int[][] dp) {
        if (m==0||n==0) return 0;
        //recursive function call
        if (dp[n][m]!=-1) return dp[n][m];
        if (weight[n-1]>m){
            return dp[n][m]= knapsackMemo(m,profit,weight,n-1,dp);
        }
        else  return dp[n][m]=Math.max(knapsackMemo(m,profit,weight,n-1,dp),profit[n-1]+knapsackMemo((m-weight[n-1]),profit,weight,n-1,dp));
    }

}
