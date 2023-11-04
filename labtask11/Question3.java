
package LabTask11;
import java.util.HashMap;

public class Question3 {
    static HashMap<Integer, Long> memo = new HashMap<>();

    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        long result = fibonacci(n - 1) + fibonacci(n - 2);
        memo.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        int n = 10; 
        long result = fibonacci(n);

        System.out.println("Fibonacci number at position " + n + " is: " + result);
    }
}

