package assignment;

public class MaxElem {
    private static int largest(int[] arr){
        int max=Integer.MIN_VALUE;
        for (int num :
                arr) {
            max=Math.max(max,num);
        }
        return  max;
    }
    public static void main(String[] args) {
        int arr[] = {34,21,54,65,43};
        int ary[]={4,3,6,7,1};
        System.out.println(largest(arr));
        System.out.println(largest(ary));

    }

}
