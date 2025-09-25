package Lista2;
import java.util.Arrays;

public class Exercicio14 {
    public static void main(String[] args) {
        int[] arr = {5,3,9,1,4,8};

        System.out.println("Antes: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Depois (crescente): " + Arrays.toString(arr));
    }
}
