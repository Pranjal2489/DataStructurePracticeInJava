package priyamam.dsa;

import java.util.Arrays;

public class RotationOf2Darr {
    public static void main(String[] args) {
        int arr[][]={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        RotateMat(arr);
        for (int elem[]:
             arr) {
            System.out.println(Arrays.toString(elem));

        }
    }

    private static void RotateMat(int[][] a) {

        //step 1.transpose
        int m=a.length;
        int n=a[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = i; j < n; j++) {
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
        //step2. swapping

        for (int i = 0; i < m; i++) {
            int li=0;
            int ri=n-1;
            while (li<n/2){
                int temp=a[i][li];
                a[i][li]=a[i][ri];
                a[i][ri]=temp;

                li++;
                ri--;
            }
        }
    }
}
