package searchsort.bitmanipulate;

import java.util.Scanner;

public class BinarySearch {
    public static int search(int[] nums, int target) {
        int low=0,high=nums.length-1;


        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                low=mid+1;

            }
            else{
                high=mid-1;

            }
        }
        return -1;
    }
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

        int res =search(arr,x);
        if (res==-1){
            System.out.println("Element not found");
        }else {
        System.out.println(res);}

    }
}
