package Lista2;

import java.util.Scanner;
public class Exercicio16 {
    public static void main(String[] args) {
        int[] arr = {4,7,2,9,7,5};
        Scanner sc = new Scanner(System.in);
        System.out.print("Elemento a buscar: ");

        int x = sc.nextInt();
        int idx = -1;
        for (int i = 0; i < arr.length; i++) if (arr[i] == x) { idx = i; break; }
        System.out.println("Índice da primeira ocorrência: " + idx);
        sc.close();
    }
}
