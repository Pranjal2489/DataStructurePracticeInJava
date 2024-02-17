package priyamam.dsa;

public class Palindrome {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,4,2,1};
        int flag=0;
        for (int i = 0; i < arr.length/2; i++) {
            if (arr[i]!=arr[arr.length-1]){
                System.out.println("not  a Palindrome");
                flag=1;
                break;
            }
        }
        if (flag==0){
            System.out.println("Palindrome");
        }
    }
}
