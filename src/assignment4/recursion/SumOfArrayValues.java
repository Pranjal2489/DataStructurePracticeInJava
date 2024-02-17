package assignment4.recursion;

public class SumOfArrayValues {
    public static void main(String[] args) {
        int[] arr={92,23,15,-20,10};
        int n=arr.length;
        int res=findSum(arr,n-1);
        System.out.println("The sum is : "+res);

    }

    private static int findSum(int[] arr, int idx) {

        if(idx==0){
            return arr[idx];
        }
       return arr[idx]+findSum(arr,idx-1);

    }
}
