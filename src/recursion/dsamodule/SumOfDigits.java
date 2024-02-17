package recursion.dsamodule;

public class SumOfDigits {
    public static void main(String[] args) {
        int num=123453;
        int res=findSumOfDigits(num);
        System.out.println("the sum of digits is : "+res);
    }

    private static int findSumOfDigits(int num) {
        if(num==0){
            return 0;
        }else {
            return (num%10)+findSumOfDigits(num/10);
        }
    }
}
