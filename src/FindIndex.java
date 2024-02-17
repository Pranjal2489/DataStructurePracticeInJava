public class FindIndex {
    public static void main(String[] args) {
        int[] arr={6,5,7,4,8,3,9};
        int num=9;
        for (int i = 0; i < arr.length; i++) {
            if (num==arr[i]){
                System.out.println(" the index of the array element is : "+i);
            }
        }
    }
}
