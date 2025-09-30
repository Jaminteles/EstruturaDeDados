package Lista2;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio35 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        Scanner sc = new Scanner(System.in);
        System.out.print("Posição a remover (0.." + (arr.length-1) + "): ");
        int pos = sc.nextInt();

        if (pos < 0 || pos >= arr.length) {
            System.out.println("Posição inválida.");
        } else {
            int[] novo = new int[arr.length - 1];
            for (int i = 0, j = 0; i < arr.length; i++) {
                if (i == pos) continue;
                novo[j++] = arr[i];
            }

            System.out.println("Antes: " + Arrays.toString(arr));
            System.out.println("Depois: " + Arrays.toString(novo));
        }
        sc.close();
    }
}
