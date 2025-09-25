package Lista1;

import java.util.Scanner;
import java.util.Arrays;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[20];
        int[] vetorPar = new int[20];
        int[] vetorImpar = new int[20];

        System.out.print("Insira os valores: ");
        for (int i = 0; i < vetor.length; i++) {
            int valori = sc.nextInt();
            vetor[i] = valori;
            if (valori%2 == 0) {
                vetorPar[i] = valori;
            } else {
                vetorImpar[i] = valori;
            }
        }

        System.out.println("Vetor: " + Arrays.toString(vetor));
        System.out.print("Vetor Par: [");
        for (int i = 0; i < vetorPar.length; i++) {
            if (vetorPar[i] != 0) {
                if (i == 19) {
                    System.out.print(vetorPar[i]);
                } else {
                    System.out.print(vetorPar[i] + ", ");
                }
            }
        }
        System.out.print("]");
        System.out.println();

        System.out.print("Vetor Impar: [");
        for (int i = 0; i < vetorImpar.length; i++) {
            if (vetorImpar[i] != 0) {
                if (i == 19) {
                    System.out.print(vetorImpar[i]);
                } else {
                    System.out.print(vetorImpar[i] + ", ");
                }
            }
        }
        System.out.print("]");
        System.out.println();
    }
}