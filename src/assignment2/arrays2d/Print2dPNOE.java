package assignment2.arrays2d;

import java.util.Scanner;

public class Print2dPNOE {
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
        findPos(arr);
        findNeg(arr);
        findOdd(arr);
        findEven(arr);
        findZero(arr);
    }

    private static void findOdd(int[][] arr) {
        int m= arr.length;
        int n=arr[0].length;
        int num=0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j]%2!=0){
                   num++ ;
                }

            }
        }System.out.println("number of odd integers"+num);
    }

    private static void findZero(int[][] arr) {
        int m= arr.length;
        int n=arr[0].length;
        int num=0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j]==0){
                    num++ ;
                }

            }
        }System.out.println("number of zeros"+num);
    }

    private static void findEven(int[][] arr) {
        int m= arr.length;
        int n=arr[0].length;
        int num=0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j]%2==0){
                    num++ ;
                }

            }
        }System.out.println("number of even integers"+num);
    }

    private static void findNeg(int[][] arr) {
        int m= arr.length;
        int n=arr[0].length;
        int num=0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j]<0){
                    num++ ;
                }
            }
        }System.out.println("number of negative integers"+num);
    }

    private static void findPos(int[][] arr) {
        int m= arr.length;
        int n=arr[0].length;
        int num=0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j]>0){
                    num++ ;
                }

            }
        }System.out.println("number of positive integers"+num);
    }
}
