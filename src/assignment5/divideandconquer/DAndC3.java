package assignment5.divideandconquer;

public class DAndC3 {
    public static void main(String[] args) {
        int[] arr={19, -20, 7, -4, -13, 11, -5, 3};
        int n= arr.length;
        int[] temp =new int[n];
        for (int i = 0; i < n; i++) {
            temp[i]=arr[i];
        }
        partition(arr,temp,0,n-1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }

    }

    private static void partition(int[] arr, int[] temp, int l, int h) {
        if (h<=l){
            return;
        }
        //divide--find midpoint
        int mid=(l+((h-l)/2));

        partition(arr,temp,l,mid);
        partition(arr, temp, mid+1, h);
        
        merge(arr,temp,l,mid,h);

    }

    private static void merge(int[] arr, int[] temp, int l, int mid, int h) {
        int k=l;
        //copy -ve elements from left subarray
        for (int i = l; i <= mid; i++) {
            if (arr[i]<0){
                temp[k++]=arr[i];
            }
        }
        //copy -ve elements from right subarray
        for (int j = mid+1; j <= h; j++) {
            if (arr[j]<0){
                temp[k++]=arr[j];
            }
        }
        //copy +ve elements from left subarray
        for (int i = l; i <= mid; i++) {
            if (arr[i]>0){
                temp[k++]=arr[i];
            }
        }
        //copy +ve elements from right subarray
        for (int j = mid+1; j <= h; j++) {
            if (arr[j]>0){
                temp[k++]=arr[j];
            }
        }
        //copy all elements of temp to array
        for (int i = l; i <=h ; i++) {
            arr[i]=temp[i];
        }
    }
}
