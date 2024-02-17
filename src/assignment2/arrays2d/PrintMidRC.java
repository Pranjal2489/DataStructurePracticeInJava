package assignment2.arrays2d;

import java.util.Scanner;

//import static jdk.internal.org.jline.keymap.KeyMap.display;

public class PrintMidRC {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int[][] arr;
        int m;
        System.out.println("enter matrix r*c  ");
        m= scan.nextInt();
        arr=new int[m][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j]= scan.nextInt();
            }
        }
        displayMRC(arr,m);
    }

    private static void displayMRC(int[][] arr, int m) {
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < m; j++) {
//                if (i==m/2|| j==m/2){
//                    System.out.print(arr[i][j]+ " ");
//                }
//            }
//        }

        for (int i = 0; i < m; i++) {
            System.out.print(arr[i][m/2]+" ");
        }

        for (int j = 0; j < m; j++) {
            if (j==m/2){
                continue;
            }
            System.out.print(arr[m/2][j]+" ");
        }
    }
}
