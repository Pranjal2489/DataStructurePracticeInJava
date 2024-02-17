package assignment3.sorting;

import java.util.Scanner;

public class LastOccurrence {
    public static void main(String[] args) {
        int arr[];
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the number of array elements");
        int m=sc.nextInt();
        arr=new int[m];
        System.out.println("enter array ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();

        }
        System.out.println("enter the value whose last index you are searching for ?");
        int target=sc.nextInt();

        int res=higherBound(arr,target);
        System.out.println(res);
    }

    private static int higherBound(int[] arr, int target) {
        int low =0,high=arr.length-1;
        int result=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if (arr[mid]==target){
                result=mid;
                low=mid+1;
            } else if (arr[mid] > target) {
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return result;
    }
}
