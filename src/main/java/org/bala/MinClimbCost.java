package org.bala;

public class MinClimbCost {
        public static int minCostClimbingStairs(int[] cost) {
            int n=cost.length;
            if(n==0){
                return 0;
            }
            if(n==1){
                return cost[0];
            }
            int s1=cost[0];
            int s2=cost[1];
            int cash;
            for(int i=2;i<n;i++){
                cash=cost[i]+Math.min(s1,s2);
                s1=s2;
                s2=cash;

            }
            return Math.min(s1,s2);
        }

    public static void main(String[] args) {
        int[] cos={1,34,56,3,78,8,2,6,9};
        System.out.println("Minimum Cost:  "+minCostClimbingStairs(cos));
    }
}
