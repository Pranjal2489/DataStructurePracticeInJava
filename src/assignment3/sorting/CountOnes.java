package assignment3.sorting;

public class CountOnes {
    public static void main(String[] args) {
        int[] arr={0,0, 0, 0, 1, 1,1,1,1,1,1};
        int res=countSetBits(arr);
        System.out.println(res);
//        int count=0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]==1){
//                count++;
//            }
//        }
//        System.out.println("the number of ones present are "+count);
    }

    private static int countSetBits(int[] arr) {
        int low=0,high= arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==0){
                low=mid+1;

            } else if (arr[mid]>0) {
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return arr.length-low;
    }
}
