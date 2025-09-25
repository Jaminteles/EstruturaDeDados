package Lista2;
import java.util.Arrays;

public class Exercicio13 {
    public static void main(String[] args) {
        int[] origem = {1,2,3,4,5};
        int[] destino = Arrays.copyOf(origem, origem.length);

        System.out.println("Origem: " + Arrays.toString(origem));
        System.out.println("Destino: " + Arrays.toString(destino));
    }
}
