package Lista1;
import java.util.Arrays;

public class Q23 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] combinado = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            combinado[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            combinado[arr1.length + i] = arr2[i];
        }
        System.out.println("Novo array: " + Arrays.toString(combinado));
    }
}