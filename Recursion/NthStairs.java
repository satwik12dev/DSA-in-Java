package Recursion;

public class NthStairs {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(ways(n));
        System.out.println(climbStairs(n));
    }
    //T.C. 2^n TLE error
    public static int ways(int n){
        if(n<=2) return n;
        return (ways(n-1) + ways(n-2));
    }

    static int[] dp;
    public static int climbStairs(int n) {
        dp = new int[n + 1];
        return solve(n);
    }
    public static int solve(int n) {
        if (n <= 2) return n;
        if (dp[n] != 0) return dp[n];
        return dp[n] = solve(n - 1) + solve(n - 2);
    }
}