package assignment5.divideandconquer;

import java.util.Arrays;

import java.util.Collections;

public class DAndC4 {
    public static void main(String[] args) {
        Integer[] a={2,1,3};
        Integer[] b={7,8,9};
        int k =10;
        int n=a.length;
        if (permute(a,b,k,n)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    private static boolean permute(Integer[] a, Integer[] b, int k, int n) {
        Arrays.sort(a);
        Arrays.sort(b, Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            if (a[i]+b[i]<k)
                return false;
        }
        return true;
    }
}
