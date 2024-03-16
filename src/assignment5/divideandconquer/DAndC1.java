package assignment5.divideandconquer;

public class DAndC1 {
    public static void main(String[] args) {
        int[] arr ={1,2,4,3,5,6};
        int n=arr.length;
        sortArr(arr ,n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    private static void sortArr(int[] arr, int n) {
        if (n<=1 ){
            return;
        }
        int x=-1;
        int y=-1;
        int prev=arr[0];
        for (int i = 1; i < n; i++) {
            if (prev>arr[i]){
                if(x==-1){
                    x=i-1;
                    y=i;

                }else {
                    y=i;
                }
            }
            prev=arr[i];
        }
        //swap
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
}
