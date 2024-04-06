package DynamicProgramming;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String s1="AGGTAYB";
        String s2="GXTXAYB";
        int m=s1.length();
        int n=s2.length();
        int dp[][]=new int[m+1][n+1];
        for (int i = 0; i < m + 1; i++) {
            for (int j = 0; j <=n; j++) {
                dp[i][j]=-1;
            }
        }
        System.out.println("the result is "+lcsTabu(s1,s2,m,n));
        System.out.println("the result is "+lcsMemo(s1,s2,m,n,dp));

    }
//memoization
    private static int lcsMemo(String s1, String s2, int m, int n, int[][] dp) {
        if(m==0||n==0) return 0;
        if (dp[m][n]!=-1){
            return dp[m][n];
        }
        if (s1.charAt(m-1)==s2.charAt(n-1)) return 1+lcsMemo(s1,s2,m-1,n-1,dp);
        else return Math.max(lcsMemo(s1,s2,m-1,n,dp),lcsMemo(s1,s2,m,n-1,dp));
    }

    private static int lcs(String s1, String s2, int m, int n) {
        if(m==0||n==0) return 0;
        if (s1.charAt(m-1)==s2.charAt(n-1)) return 1+lcs(s1,s2,m-1,n-1);
        else return Math.max(lcs(s1,s2,m-1,n),lcs(s1,s2,m,n-1));

    }
    private static int lcsTabu(String s1, String s2, int m, int n){
        int[][] dp=new int[m+1][n+1];
        for (int i = 0; i < m + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                if (i==0||j==0) dp[i][j]=0;
                else if (s1.charAt(i-1)==s2.charAt(j-1)) {
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[m][n];
    }
}
