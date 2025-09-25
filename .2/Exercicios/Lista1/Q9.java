package Lista1;

import java.util.Scanner;
import java.util.Arrays;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[10];
        int soma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Insira o " + (i+1) + "° " + "número inteiro");
            A[i] = sc.nextInt();
            soma += (A[i] * A[i]);
        }

        System.out.println("A soma dos quadrados dos números inseridos é: " + soma);
    }
}