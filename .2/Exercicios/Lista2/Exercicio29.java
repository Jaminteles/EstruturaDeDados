package Lista2;
import java.util.Scanner;
import java.util.Arrays;

public class Exercicio29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int N = sc.nextInt();
        long[] lucas = new long[Math.max(1, N)];

        if (N >= 1) lucas[0] = 2;
        if (N >= 2) lucas[1] = 1;

        for (int i = 2; i < N; i++) lucas[i] = lucas[i-1] + lucas[i-2];

        System.out.println("Lucas: " + Arrays.toString(lucas));
        sc.close();
    }
}
