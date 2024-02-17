package searchsort.bitmanipulate;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[]={20,15,47,34,87,66};
        insertionSort(arr);
        System.out.println("the sorted array is ");
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j=i;
            while (j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;

                j--;

            }
        }
    }
}
