package Lista1;
import java.util.Arrays;

public class Q18 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] resultado = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            resultado[i] = arr1[i] * arr2[i];
        }
        System.out.println("Resultado: " + Arrays.toString(resultado));
    }
}