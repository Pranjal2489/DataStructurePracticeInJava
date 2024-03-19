package assignment5.divideandconquer;

public class Greedy3 {
    public static void main(String[] args) {
        int[] gas={1,2,3,4,5};
        int[] cost={3,4,5,1,2};
        System.out.println("The starting station for complete round trip to all stations is "+canCompleteCircuit(gas,cost));
    }

    private static int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas=0;
        int totalCost=0;
        for (int i = 0; i <gas.length; i++) {
            totalGas+=gas[i];
            totalCost+=cost[i];
        }
        if (totalGas<totalCost) return -1;
        int remainingGas=0,start=0;
        for (int i = 0; i < gas.length; i++) {
            remainingGas=remainingGas+gas[i]-cost[i];
            if (remainingGas<0){
                start=i+1;
                remainingGas=0;
            }
        }return start;
    }
}
