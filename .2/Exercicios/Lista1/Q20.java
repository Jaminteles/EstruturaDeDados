package Lista1;
import java.util.Arrays;

public class Q20 {
    public static void main(String[] args) {
        String[] arr = {"Java", "C", "Java", "Python", "Java"};
        String alvo = "Java";
        String[] novo = new String[arr.length];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].equals(alvo)) {
                novo[j++] = arr[i];
            }
        }

        String[] resultado = Arrays.copyOf(novo, j);
        System.out.println("Resultado: " + Arrays.toString(resultado));
    }
}