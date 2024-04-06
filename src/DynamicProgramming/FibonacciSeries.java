package DynamicProgramming;

import java.util.HashMap;
import java.util.Map;

public class FibonacciSeries {
    public static Map<Integer,Long> memo=new HashMap<>();
    public static void main(String[] args) {
        int n=50;
        System.out.println("The num is : "+fibMemo(n));
        System.out.println("The num is : "+fibonacci(n));
        System.out.println("The num is : "+fibOPt(n));
    }

    private static int fib(int n) {
        if (n<=1)
            return n;
        return fib(n-1)+fib(n-2);
    }
    //memoization
    private static  long fibMemo(int n){
        if (n<=1)
            return n;

        //to avoid re-computations
        if (memo.containsKey(n)){
            return memo.get(n);
        }
        long fibVal=fibMemo(n-1)+fibMemo(n-2);
        memo.put(n,fibVal);
        return fibVal;

    }
    //Tabulation Approach DP
    private static long fibonacci(int n){
        long [] arr=new long[n+1];
        arr[0]=0;
        arr[1]=1;
        for (int i = 2; i < n + 1; i++) {
            arr[i]=arr[i-1]+arr[i-2];
        }return arr[n];

    }

    //most Optimized Approach
    public static long fibOPt(int n){
        long first=0,second=1,third;
        for (int i = 2; i <=n ; i++) {
            third=first+second;
            first=second;
            second=third;
        }
        return second;
    }
}
