package fibonacci;

import java.util.Scanner;
import java.util.Arrays;

public class FIbonacciMemoization {
    public static int fib(int n, int[] dp) {
        if (n <= 1) return n;
        if (dp[n] != -1) return dp[n];
        dp[n] = fib(n - 2, dp) + fib(n - 1, dp);
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1);
        fib(n, dp);
        System.out.println(fib(n,dp));
    }
}
