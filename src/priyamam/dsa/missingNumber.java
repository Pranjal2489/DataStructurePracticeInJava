package priyamam.dsa;

public class missingNumber {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,7,6};
        int n=arr.length;
        int sum_naturalNum=((n+1)*(n+2))/2;
        int sum=0 ;
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
        }
        int res=sum_naturalNum-sum;
        System.out.println("the missing number is"+res);
    }
}
