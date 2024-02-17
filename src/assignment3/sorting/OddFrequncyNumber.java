package assignment3.sorting;

public class OddFrequncyNumber {
    public static void main(String[] args) {
        int[] arr ={4,3,4,6,6,4,4,4,5,3,3,1,3,5,1};
        int oddFreqNum=getOddFreqNum(arr);
        System.out.println("The odd frequency num in given array is "+oddFreqNum);

    }

    private static int getOddFreqNum(int[] arr) {
        int xor=0;
        for (int num:arr){
            xor=xor^num;
        }
        return xor;
    }
}
