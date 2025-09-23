package Lista2;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe N: ");
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 1; i <= N; i++) {
            arr[i-1] = i * i;
        }

        System.out.println("Quadrados de 1 a " + N + ":");
        for (int v : arr) System.out.println(v);
        sc.close();
    }
}
