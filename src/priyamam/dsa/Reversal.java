package priyamam.dsa;

public class Reversal {
    public static void main(String[] args) {
        int arr[]={1,4,3,5,3,4,5,6,9};
        int n=arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
