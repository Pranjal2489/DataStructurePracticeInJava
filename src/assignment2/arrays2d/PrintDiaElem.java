package assignment2.arrays2d;

import java.util.Scanner;

public class PrintDiaElem {
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

        diagonalElements(arr,m,n);
        secondDiagonalElems(arr);
    }

    private static void secondDiagonalElems(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i+j<=arr.length/2){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
        System.out.println();
    }

    private static void diagonalElements(int[][] arr,int m,int n) {
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                if (i==j || i+j== arr.length-1){
//                    System.out.print(arr[i][j]+" ");
//                }
//            }
//        }
//        System.out.println();
        for (int i = 0; i < m; i++) {
            System.out.print(arr[i][i]+" ");

            //secondary elems
            if (i != m-1-i){
                System.out.print(arr[i][m-i-1]+" ");
            }

        }
        System.out.println();
    }
}
