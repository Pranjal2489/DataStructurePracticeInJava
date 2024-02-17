package assignment;

public class PeakElem {
    public static void main(String[] args) {
        int arr[]={1,3,2,6,5};
        int ary[] = {1,4,7,3,2,6,5};

        findPeakElem(arr);
        findPeakElem(ary);
    }

    private static void findPeakElem(int[] arr) {
//        for (int left = 0; left <arr.length-1 ; left++) {
//            int peak_elem=left+1,right=peak_elem+1;
//            if (arr[peak_elem]>arr[left] && arr[peak_elem]>arr[right]){
//                System.out.println(arr[peak_elem]);
//            }
//        }
        int n=arr.length;
        for (int i = 1; i < n-1; i++) {
            if (arr[i-1]<arr[i]&& arr[i]>arr[i+1]){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
