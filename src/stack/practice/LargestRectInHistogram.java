package stack.practice;

import java.util.Arrays;
import java.util.Scanner;

public class LargestRectInHistogram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of Heights");
        int n= sc.nextInt();
        int[] arr=new int[n];

        System.out.println("Enter the heights of histogram");

        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        findMaxArea(arr,n);
    }

    private static void findMaxArea(int[] arr,int n) {
        //1. PreviousSmaller
        int maxArea=0;
        int li=0;
        int ri=n-1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if(arr[j]<arr[i]){
                    li=j;
                }
            }
            for (int j = i+1; j < n; j++) {
                if (arr[j]<arr[i]){
                    ri=j;
                }
            }
            int Area=(ri-li+1)*arr[i];
            maxArea=Math.max(maxArea,Area);
        }

        System.out.println("maximum Area is "+maxArea);
    }
}
