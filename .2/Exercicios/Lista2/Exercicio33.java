package Lista2;
import java.util.Arrays;

public class Exercicio33 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println("Antes: " + Arrays.toString(arr));
        int val = 10;
        int[] novo = Arrays.copyOf(arr, arr.length + 1);

        novo[novo.length - 1] = val;
        System.out.println("Depois: " + Arrays.toString(novo));
    }
}
