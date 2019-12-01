package chapter21;

import utils.P;

import java.util.Arrays;

public class Fibonacci implements Runnable {
    private int n;
    private int[] fib;

    public Fibonacci(int n) {
        this.n = n;
        fib = new int[n];
        if (n > 0) fib[0] = 1;
        if (n > 1) fib[1] = 1;
    }

    @Override
    public void run() {
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        P.println(Arrays.toString(fib));
    }
}
