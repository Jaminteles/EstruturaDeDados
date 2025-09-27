// Exercício 19: Inicialize um array de strings e depois inverta a ordem dos elementos. Imprima o antes e o depois.
import java.util.Arrays;
public class Exercicio19 {
    public static void main(String[] args) {
        String[] arr = {"um","dois","três","quatro"};
        System.out.println("Antes: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length / 2; i++) {
            String tmp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = tmp;
        }
        System.out.println("Depois: " + Arrays.toString(arr));
    }
}
