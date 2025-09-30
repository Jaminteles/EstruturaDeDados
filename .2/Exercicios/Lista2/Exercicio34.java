package Lista2;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        Scanner sc = new Scanner(System.in);

        System.out.print("Posição (0.." + arr.length + "): ");
        int pos = sc.nextInt();
        System.out.print("Elemento: ");
        int val = sc.nextInt();

        if (pos < 0 || pos > arr.length) {
            System.out.println("Posição inválida.");
        } else {
            int[] novo = new int[arr.length + 1];
            System.arraycopy(arr, 0, novo, 0, pos);
            novo[pos] = val;
            System.arraycopy(arr, pos, novo, pos+1, arr.length - pos);
            System.out.println("Resultado: " + Arrays.toString(novo));
        }

        sc.close();
    }
}
