package Leetcode;

public class ClimbStairs {
    public static int climbStairs(int n) {
        int[] dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        if(n<2){
            return n;
        }else{
            for(int i=2;i<=n;i++){
                dp[i]=dp[i-1]+dp[i-2];
            }
        }return dp[n];
    }
    public static int climbStairs2(int n) {
        int n1=1,n2=1;
        int steps=0;
        if(n<2){
            return n;
        }else{
            for(int i=2;i<=n;i++){
                steps=n1+n2;
                n1=n2;
                n2=steps;
            }
        }
       return steps;
    }

    public static void main(String[] args){
        System.out.println("you can climb "+climbStairs2(5)+" unique ways!!!!!!!!!!!!!!");
    }
}
