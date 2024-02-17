package assignment3.sorting;

import java.util.Scanner;

public class LinearSearching {
    public static void main(String[] args) {
        int arr[];
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the number of array elements");
        int m=sc.nextInt();
        arr=new int[m];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();

        }
        System.out.println("enter the value you are searching for ?");
        int target=sc.nextInt();

        int res=linearSearching(arr,target);
        if (res==-1){
            System.out.println("element not found");
        }else {
            System.out.println(" Element is found at index "+res);
        }
    }

    private static int linearSearching(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target){
                return  i;
            }
        }
        return -1;
    }
}
