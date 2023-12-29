import java.util.HashMap;
import java.util.Map;

public class FibonacciCalculator {
    private static Map<Integer, Integer> memo = new HashMap<>();

    public static void main(String[] args) {
        // Calculate the 40th Fibonacci number
        int n = 40;
        int fibonacciNumber = fibonacciImproved(n);

        System.out.println("Fibonacci number at position " + n + " is: " + fibonacciNumber);
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static int fibonacciImproved(int n) {
        if (n <= 1) {
            return n;
        } else {
            if (!memo.containsKey(n)) {
                memo.put(n, fibonacciImproved(n - 1) + fibonacciImproved(n - 2));
            }
            return memo.get(n);
        }
    }
}
