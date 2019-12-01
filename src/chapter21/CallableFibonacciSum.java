package chapter21;

import java.util.concurrent.Callable;

public class CallableFibonacciSum implements Callable<Integer> {
    private int n;
    private int[] fib;
    private int sum;

    public CallableFibonacciSum(int n) {
        this.n = n;
        fib = new int[n];
        if (n > 0) {
            fib[0] = 1;
            sum = 1;
        }
        if (n > 1) {
            fib[1] = 1;
            sum = 2;
        }
    }

    @Override
    public Integer call() throws Exception {
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
            sum += fib[i];
        }
        return sum;
    }
}
