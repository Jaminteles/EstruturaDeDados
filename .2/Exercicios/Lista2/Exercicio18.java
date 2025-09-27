package Lista2;
import java.util.Arrays;

public class Exercicio18 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = {4,3,2,1};
        int n = Math.min(a.length, b.length);
        int[] c = new int[n];

        for (int i = 0; i < n; i++) c[i] = a[i] * b[i];
        System.out.println("Resultado: " + Arrays.toString(c));
    }
}
