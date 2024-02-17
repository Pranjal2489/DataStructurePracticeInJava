package assignment;

public class SecondLargestElem {
    public static void main(String[] args) {
        int arr[]={44,5,3,2,5,35,7,35,7,4,56,7,5,7};
        int max1=Integer.MAX_VALUE;
        int max2=Integer.MIN_VALUE;
        for (int num :
                arr) {
            max1 = Math.max(max1, num);
        }
        for (int num :
                arr) {
            if (num != max1) {
                max2 = Math.max(max2, num);
            }

        }
        if (max2==Integer.MIN_VALUE){
            System.out.println("no 2nd largest ");
        }else {
            System.out.println("the 2nd max elem is"+max2);
        }

    }
}
