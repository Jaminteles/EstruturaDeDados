package Lista2;
import java.util.Arrays;
import java.util.Random;

public class Exercicio15 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int N = 10;
        Integer[] arr = new Integer[N];

        for (int i = 0; i < N; i++) arr[i] = rnd.nextInt(100);

        System.out.println("Aleatórios: " + Arrays.toString(arr));
        Arrays.sort(arr, java.util.Collections.reverseOrder());
        System.out.println("Decrescente: " + Arrays.toString(arr));
    }
}
