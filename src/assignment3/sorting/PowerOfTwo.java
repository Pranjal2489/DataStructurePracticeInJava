package assignment3.sorting;

public class PowerOfTwo {
    public static void main(String[] args) {
        int num=8;
        if (checkPowerOfTwo(num)){
            System.out.println("true ");
        }else
            System.out.println("False");
    }

    private static boolean checkPowerOfTwo(int num) {
        if (num==0){
            return false;
        }else {
            return ((num&num-1)==0);
        }
    }
}
