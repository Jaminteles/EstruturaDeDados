package Lista2;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Scanner sc = new Scanner(System.in);

        System.out.print("Posição (0.." + arr.length + "): ");
        int pos = sc.nextInt();
        System.out.print("Elemento: ");
        int val = sc.nextInt();

        if (pos < 0 || pos > arr.length) {
            System.out.println("Posição inválida.");
        } else {
            int[] novo = new int[arr.length + 1];

            for (int i = 0; i < pos; i++) novo[i] = arr[i];
            novo[pos] = val;

            for (int i = pos; i < arr.length; i++) novo[i+1] = arr[i];
            System.out.println("Resultado: " + Arrays.toString(novo));
        }
        sc.close();
    }
}
