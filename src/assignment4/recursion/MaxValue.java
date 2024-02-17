package assignment4.recursion;

public class MaxValue {
    public static void main(String[] args) {
        int[] arr ={13,1,-3,22,5};
        int idx=0;
        int n= arr.length;

        int res=findMax(arr,idx ,n);
        System.out.println("the max number present in array is"+res);
    }

    private static int findMax(int[] arr, int idx, int n) {
        if (idx==n-1){
            return arr[n-1];
        }
        int maxOfNextIndices=findMax(arr,idx+1,n);
        int maxVal=Math.max(arr[idx],maxOfNextIndices);
        return maxVal;
    }
}
