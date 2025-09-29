package Lista2;
import java.util.Scanner;
import java.util.Arrays;

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int N = sc.nextInt();

        long[] fib = new long[Math.max(1, N)];

        if (N >= 1) fib[0] = 0;
        if (N >= 2) fib[1] = 1;

        for (int i = 2; i < N; i++) fib[i] = fib[i-1] + fib[i-2];
        System.out.println("Fibonacci: " + Arrays.toString(fib));

        sc.close();
    }
}
