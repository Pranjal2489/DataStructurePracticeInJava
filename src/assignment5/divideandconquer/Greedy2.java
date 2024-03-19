package assignment5.divideandconquer;

public class Greedy2 {
    public static void main(String[] args) {
        int[] start={1,3,0,5,8,5};
        int[] finish={2,4,6,7,9,9};
        int n= start.length;
        printMaxActivities(start,finish,n);
    }

    private static void printMaxActivities(int[] s, int[] f, int n) {
        int i,j;
        System.out.println("These activities are selected ");
        i=0;
        System.out.print(i+" ");
        for ( j = 1; j < n; j++) {
            if (s[j]>=f[i]) {
                System.out.print(j+" ");
                i=j;
            }
        }
    }
}
