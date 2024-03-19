package assignment5.divideandconquer;

import java.util.Random;

public class Selection {
    public static void main(String[] args) {
        int [] arr={10,4,5,8,6,11,26};
        int kposition=3;
        int len= arr.length;
        if (kposition>len){
            System.out.println("index out of bound");
        }else {
            System.out.println("Kth largest element in array : "+findKthLargest(arr,kposition));
        }
    }

    private static int findKthLargest(int[] arr, int k) {
        //kth element will be at n-k position in array
        return quickSelect(arr,0,arr.length-1,arr.length-k);
    }

    private static int quickSelect(int[] arr, int left, int right, int k) {
        if (left==right) return arr[left];
        int pindex= new Random().nextInt(right-left+1)+left;
        pindex=partition(arr,left,right,pindex);
        if (pindex==k) return arr[k];
        else if (pindex<k) return quickSelect(arr, pindex+1, right, k);
        return quickSelect(arr, left, pindex-1, k);
    }

    private static int partition(int[] arr, int left, int right, int pindex) {
        int pivot=arr[pindex];
        swap(arr,pindex,right);
        pindex=left;
        for (int i = left; i <=right; i++) {
            if (arr[i]<=pivot)
                swap(arr,i,pindex++);
        }
        return pindex-1;
    }

    private static void swap(int[] arr, int x, int y) {
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }

}
