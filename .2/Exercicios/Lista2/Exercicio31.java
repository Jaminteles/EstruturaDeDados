package Lista2;
import java.util.Arrays;

public class Exercicio31 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("Antes: " + Arrays.toString(arr));

        if (arr.length > 0) {
            int first = arr[0];
            for (int i = 0; i < arr.length - 1; i++) arr[i] = arr[i+1];
            arr[arr.length - 1] = first;
        }

        System.out.println("Depois (rotacionado à esquerda): " + Arrays.toString(arr));
    }
}
