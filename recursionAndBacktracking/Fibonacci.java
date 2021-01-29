package recursionAndBacktracking;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(getFibonacci(number));

    }

    private static long getFibonacci(int number) {
        long[] fibonacciNumbers = new long[number + 1];

        fibonacciNumbers[0] = 1;
        fibonacciNumbers[1] = 1;

        for (int i = 2; i <= number; i++) {
            fibonacciNumbers[i] = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2];
        }

        return fibonacciNumbers[number];
    }
}