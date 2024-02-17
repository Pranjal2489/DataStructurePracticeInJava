package assignment3.sorting;

public class CheckOddEven {
    public static void main(String[] args) {
        int num=9;
        checkNum(num);
    }

    private static void checkNum(int num) {
        if ((num&1)==0){
            System.out.println("Even");
        }else
            System.out.println("Odd ");
    }
}
