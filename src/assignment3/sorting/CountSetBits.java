package assignment3.sorting;

public class CountSetBits {
    public static void main(String[] args) {
        int num=15;
        int res=getCountSetBits(num);
        System.out.println("The count of set bits is "+res);
    }

    private static int getCountSetBits(int num) {
        int count=0;
        while (num>0){
            count+=num&1;
            num>>=1;
        }
        return count;
    }
}
