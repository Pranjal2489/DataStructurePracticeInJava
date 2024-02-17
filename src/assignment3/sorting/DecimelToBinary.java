package assignment3.sorting;

public class DecimelToBinary {
    public static void main(String[] args) {
        int num=5;
        getDeciToBin(num);
//        System.out.println(5>>1);
//        System.out.println(2>>1);
    }

    private static void getDeciToBin(int num) {
        StringBuilder result=new StringBuilder();
        while (num>0){
            int bit=num&1;
            result.insert(0,bit);
            num>>=1;
        }
        if (result.length()==0){
            System.out.println("0");
        }else
            System.out.println("Binary rep of a given num is "+result);
    }
}
