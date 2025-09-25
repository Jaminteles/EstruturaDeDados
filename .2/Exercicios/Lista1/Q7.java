package Lista1;

import java.util.Scanner;
import java.util.Arrays;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        int soma;
        int mul;

        for  (int i = 0; i < 5; i++) {
            System.out.println("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            soma += numeros[i];
        }

        System.out.println("A soma desses numeros é: " + soma);

        for  (int i = 0; i < 5; i++) {
            if (i == 0) {
                mul = numeros[i];
            } else {
                mul = mul*numeros[i];
            }
        }

        System.out.println("A multiplicação desses numero é: " + mul);
        System.out.println("Os números inseridos foram: " + Arrays.toString(numeros));
    }
}