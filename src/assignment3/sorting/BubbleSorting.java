package assignment3.sorting;


import java.util.Arrays;

public class BubbleSorting {
    public static void main(String[] args) {
        int arr[]={3,5,1,6,0};
        bubbleSorting(arr);
        System.out.println("the sorted array is : ");
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSorting(int[] arr) {
        int n=arr.length;
        for (int i = 0; i <n-1; i++) {
        boolean swap=false;
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap=true;
                }

            }
            if (!swap){
                break;
            }
        }
    }
}
