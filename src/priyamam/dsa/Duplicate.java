package priyamam.dsa;

public class Duplicate {
    public static void main(String[] args) {
        int arr[]={1,3,4,5,6,7,5};
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i]==arr[j]){
                    System.out.println("the duplicate element is "+ arr[i]);
                    break;
                }
            }
        }
    }
}
