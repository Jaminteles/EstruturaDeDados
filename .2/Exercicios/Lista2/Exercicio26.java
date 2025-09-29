package Lista2;
import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio26 {
    public static boolean isPrime(int x) {
        if (x < 2) return false;

        for (int i = 2; i*i <= x; i++) if (x % i == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");

        int N = sc.nextInt();
        int[] primes = new int[N];
        int count = 0, candidate = 2;

        while (count < N) {
            if (isPrime(candidate)) { primes[count++] = candidate; }
            candidate++;
        }
        for (int p : primes) System.out.println(p);
        sc.close();
    }
}
