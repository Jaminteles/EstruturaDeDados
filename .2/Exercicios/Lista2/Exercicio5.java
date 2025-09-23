package Lista2;
import java.util.Arrays;

public class Exercicio5 {
    public static void main(String[] args) {
        int[] arr = {5, 12, 7, 12, 3, 99, 54};
        Integer max = null, second = null;

        for (int v : arr) {
            if (max == null || v > max) {
                second = max;
                max = v;
            } else if ((second == null || v > second) && v != max) {
                second = v;
            }
        }

        if (second == null) System.out.println("Não existe segundo maior distinto.");
        else System.out.println("Segundo maior: " + second);
    }
}
