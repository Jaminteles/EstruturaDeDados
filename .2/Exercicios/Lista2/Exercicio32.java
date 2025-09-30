package Lista2;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio32 {
    public static int buscaBinaria(int[] arr, int x) {
        int l = 0, r = arr.length - 1;

        while (l <= r) {
            int m = (l + r) / 2;
            if (arr[m] == x) return m;
            else if (arr[m] < x) l = m + 1;
            else r = m - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,11,13};
        Scanner sc = new Scanner(System.in);
        System.out.print("Elemento a buscar: ");
        int x = sc.nextInt();
        System.out.println("Índice: " + buscaBinaria(arr, x));
        sc.close();
    }
}
