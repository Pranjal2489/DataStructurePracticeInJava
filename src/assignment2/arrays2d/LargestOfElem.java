package assignment2.arrays2d;

import java.util.Scanner;

public class LargestOfElem {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[][] arr;
        int m,n;
        System.out.println("Enter the number of rows");
        m= scanner.nextInt();
        System.out.println("enter the number of col ");
        n= scanner.nextInt();
        arr=new int[m][n];
        System.out.println("enter array");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j]= scanner.nextInt();
            }
        }

        findLargest(arr,m,n);
    }

    private static void findLargest(int[][] arr, int m, int n) {
//        int lar=0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                if (arr[i][j]>lar){
//                    lar=arr[i][j];
//                }
//
//            }
//        }
//        System.out.println(lar);

        int max=Integer.MIN_VALUE;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                max=Math.max(max,arr[i][j]);
            }
        }
        System.out.println("largest elem "+max);


    }
}
