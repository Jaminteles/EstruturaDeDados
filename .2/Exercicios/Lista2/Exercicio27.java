package Lista2;
import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio27 {
    public static int sumDivs(int n) {
        int sum = 1;

        for (int i = 2; i*i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                if (i != n / i) sum += n / i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int N = sc.nextInt();
        ArrayList<Integer> perfects = new ArrayList<>();

        for (int i = 2; i < N; i++) {
            if (sumDivs(i) == i) perfects.add(i);
        }
        System.out.println("Perfeitos menores que " + N + ": " + perfects);

        sc.close();
    }
}
