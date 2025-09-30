package Lista1;
import java.util.Arrays;
import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};
        System.out.print("Digite a posição: ");
        int pos = sc.nextInt();
        System.out.print("Digite o elemento: ");
        int elem = sc.nextInt();
        int[] novo = new int[arr.length + 1];

        for (int i = 0, j = 0; i < novo.length; i++) {
            if (i == pos) {
                novo[i] = elem;
            } else {
                novo[i] = arr[j++];
            }
        }

        System.out.println("Resultado: " + Arrays.toString(novo));
        sc.close();
    }
}