package assignment5.divideandconquer;

import java.util.Arrays;
import java.util.Comparator;

public class Greedy5 {
//    static  class Interval{
//        int start;
//        int end;
//        public Interval(int start,int end){
//            this.start=start;
//            this.end=end;
//        }
//    }
    public static void main(String[] args) {
//        Interval[] arr={new Interval(1,2),new Interval(2,4),new Interval(5,7),new Interval(3,5)};
//        System.out.println(OverlappingIntervals(arr));

        int [][] intervals={{1,2},{2,3},{3,4},{1,3}};
        System.out.println("the desires output is "+ eraseOverlappingIntervals(intervals));

    }

    private static int eraseOverlappingIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));
        int[] curr=new int[]{intervals[0][0],intervals[0][1]};
        int maxCap=1;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0]<curr[1]) continue;
            curr[0]=intervals[i][0];
            curr[1]=intervals[i][1];
            maxCap++;
        }return intervals.length-maxCap;
    }

//    private static int OverlappingIntervals(Interval[] arr) {
//        Arrays.sort(arr);


//    }
}
