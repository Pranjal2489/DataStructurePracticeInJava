package searchsort.bitmanipulate;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={5,2,3,1};
        selectionSort(arr);
        System.out.println("the sorted array is ");
        System.out.printf(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            int min_idx=i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<arr[min_idx]){
                    min_idx=j;
                }
            }
            if (min_idx!=i){
                int temp=arr[min_idx];
                arr[min_idx]=arr[i];
                arr[i]=temp;
            }
        }
    }
}
