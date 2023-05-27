package Questão3;

public class Main {
    
    public static void main(String[] args) {
        int n = 11;

        for(int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else { 
            int[] fib = new int[n + 1];
            fib[0] = 0;
            fib[1] = 1;

            for (int i = 2; i <= n; i++) {
                fib[i] = fib[i - 1] + fib[i - 2];
            }

            return fib[n];
        }
    }
}
