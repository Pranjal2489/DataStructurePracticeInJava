package assignment3.sorting;

import java.util.Arrays;

public class InsertionSorting {
    public static void main(String[] args) {
        int arr[]={3,5,1,6,0};
        insertionSorting(arr);
        System.out.println("the sorted array is : ");
        System.out.println(Arrays.toString(arr));

    }

    private static void insertionSorting(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j=i;
            while (j>0 && arr[j]>arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;

                j--;
            }
        }
    }
}
