package recursion.dsamodule;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] arr={1,4,5,7,8,9,12,14,17,21};
        int low=0;
        int high=arr.length;
        int x=2;
        int res =binaryRecursive(arr,low,high,x);
        System.out.println("The element present at index "+res);
    }

    private static int binaryRecursive(int[] arr, int low, int high, int x) {
        int result=-1;
        while (low<=high){
            int mid=low+(high-low)/2;
            if (arr[mid]==x){
                return mid;
            } else if (arr[mid]<x) {
                return binaryRecursive(arr,mid+1,high,x);

            }
            else {
               return binaryRecursive(arr,low,mid-1,x);
            }

        }
        return result;
    }
}
