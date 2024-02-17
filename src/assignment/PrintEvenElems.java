package assignment;

public class PrintEvenElems {
    public static void main(String[] args) {
        int arr[] = {34,21,54,65,43};
        int ary[]={4,3,6,7,1};
        evenElems(arr);
        evenElems(ary);

    }

    private static void evenElems(int[] arr) {

        for (int num :
                arr) {
            if (num%2==0){
                System.out.print(num+" ");

            }
        }
        System.out.println();
//        return 0;
    }
}
