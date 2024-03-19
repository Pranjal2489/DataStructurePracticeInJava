package assignment5.divideandconquer;

public class Greedy1 {
    public static void main(String[] args) {
        int[] a ={2,-3,4,6,9};
        int[] b={1,4,-2,-3,7};
        int n= a.length;
        int k=5;
        System.out.println("the desired output is "+findMinProduct(a,b,n,k));
    }

    private static int findMinProduct(int[] a, int[] b, int n, int k) {
        int diff=0,res=0,temp=0;
        for (int i = 0; i < n; i++) {
            int pro=a[i]*b[i];
            res=res+pro;
            if (pro<0 && b[i]<0) temp=(a[i]+2*k)*b[i];
            else if (pro<0 && a[i]<0) temp=(a[i]-2*k)*b[i];
            else if (pro>0 && a[i]<0) temp=(a[i]+2*k)*b[i];
            else if (pro>0 && a[i]>0) temp=(a[i]-2*k)*b[i];
            int d=Math.abs(pro-temp);
            if (d>diff) diff=d;
        }return res-diff;
    }
}
