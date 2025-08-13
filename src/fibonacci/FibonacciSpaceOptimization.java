package fibonacci;
import java.util.Scanner;

public class FibonacciSpaceOptimization {
    public static int fib(int n) {
        if (n <= 1) return n;
        int temp1 = 0, temp2 = 1;
        for (int i = 2; i <= n; i++) {
            int cur = temp1 + temp2;
            temp1 = temp2;
            temp2 = cur;
        }
        return temp2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fib(n));
    }
}
