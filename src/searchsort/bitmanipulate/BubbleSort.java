package searchsort.bitmanipulate;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={12,10,100,90,70,80,65};
        //function call
        sortBubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sortBubble(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean swapped =false;
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if (swapped==false){
                break;
            }
        }
    }
}
