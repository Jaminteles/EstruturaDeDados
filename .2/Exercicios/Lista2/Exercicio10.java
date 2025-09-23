package Lista2;
import java.util.Arrays;

public class Exercicio10 {
    public static void main(String[] args) {
        int[] arr = {5, -3, 7, -1, 0, -10};

        System.out.println("Antes: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) if (arr[i] < 0) arr[i] = 0;

        System.out.println("Depois: " + Arrays.toString(arr));
    }
}
