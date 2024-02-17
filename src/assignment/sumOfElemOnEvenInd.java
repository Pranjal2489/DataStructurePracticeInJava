package assignment;

public class sumOfElemOnEvenInd {
    public static void main(String[] args) {
//        int arr[] = {3,20,4,6,9};
        int arr[] = {4,3,6,7,1};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            if (i%2==0){
                sum+=arr[i];
            }
        }
        System.out.println(sum);

    }
}
