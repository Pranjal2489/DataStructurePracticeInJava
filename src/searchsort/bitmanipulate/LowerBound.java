package searchsort.bitmanipulate;

import java.util.Scanner;

public class LowerBound {
    public static void main(String[] args) {

        int arr[];
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the values you want in array");
        int n= scan.nextInt();
        arr=new int[n];
        System.out.println("enter array values");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= scan.nextInt();
        }
        System.out.println("enter target element ");
        int x= scan.nextInt();
        int res=findFirstOccurrence(arr,x);
        if(res==-1){
            System.out.println("element not present");
        }else {
            System.out.println("Element present at index "+res);
        }
    }

    private static int findFirstOccurrence(int[] arr, int target) {
        int low=0,high=arr.length-1;
        int result=-1;
        while (low<=high){
            int mid=(low+(high-low)/2);
            if (arr[mid]==target){
                result=mid;
                high=mid-1;
            }
            else if (arr[mid]<target) {
                low=mid+1;

            }
            else {
                high=mid-1;
            }

        }
        return result;
    }
}