package DynamicProgramming;

import java.util.HashMap;
import java.util.Map;

public class ClimbingStairs {
    public static void main(String[] args) {
        int n=6;
        System.out.println(numWays( n));
        System.out.println(climbStairs(n));
        System.out.println(climbStairsTab(n));
    }

    //recursion
    private static int numWays(int n) {
        if(n==1 || n==2)
            return n;
        return numWays(n-1)+numWays(n-2);
    }

    //memoization
    public  static Map<Integer,Integer> mem=new HashMap<>();

    public static  int climbStairs(int n){
        if(n==1 || n==2)
            return n;
        //avoid recomputations
        if (mem.containsKey(n))
            return mem.get(n);
        //recursive fun call
        int ways=climbStairs(n-1)+climbStairs(n-2);
        mem.put(n,ways);
        return ways;
    }
    //tabulation approach
    public static  int climbStairsTab(int n){
        if (n==1) return 1;
//        array initialization
    int[] cs=new int[n+1];
    cs[1]=1;
    cs[2]=2;
        for (int i = 3; i <=n; i++) {
            cs[i]=cs[i-1]+cs[i-2];
        }return cs[n];
    }

    //optimized approach
    public static  int climbStairsOpt(int n){
        if (n==1 ) return 1;
        int first=1,second=2,third;
        for (int i = 3; i <= n; i++) {
            third=first+second;
            first=second;
            second=third;
        }return second;
    }
}
