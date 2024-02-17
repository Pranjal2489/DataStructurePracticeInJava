package searchsort.bitmanipulate;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[];
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the values you want in array");
        int n= scan.nextInt();
        arr=new int[n];
        System.out.println("enter array values");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= scan.nextInt();
        }
        System.out.println("enter target element ");
        int x= scan.nextInt();

        int idx=-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==x){
                idx=i;
                break;
            }
        }

        if (idx==-1){
            System.out.println("no element found");
        }else{
            System.out.println("elemant found at index "+idx);
        }
    }
}
