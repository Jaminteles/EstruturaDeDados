package Lista1;
import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {10, 20, 30, 40, 50};
        int indice = -1;

        System.out.print("Digite o elemento a buscar: ");
        int valor = sc.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == valor) {
                indice = i;
                break;
            }
        }

        System.out.println("Índice encontrado: " + indice);
        sc.close();
    }
}