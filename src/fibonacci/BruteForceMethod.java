package fibonacci;

import java.util.Scanner;

public class BruteForceMethod {
    public static int fib(int data) {
        if (data <= 1) return data;
        else return fib(data - 1) + fib(data - 2);
    }

    public static void main(String[] args) {
        System.out.println(fib(5));
    }
}
