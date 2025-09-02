// Q1)

public class Q1 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};

        System.out.println("Elementos no array:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posição " + i + ": " + numeros[i]);        
        }
    }
}

// Q2)

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for (int i = 0; i < N; i++){
            quadrados[i] = (i + 1) * (i + 1);
        }
        System.out.println("Array de quadrados de 1 até " + N + ":");
        for int i = 0; i < quadrados.length; i++) {
            System.out.println("Posição " + i + " -> " + quadrados[i]);
        }
        sc.close();
    }
}

// Q3)

public class Q3 {

    System.out.println("Digite a 1° notas: ");
    double nota1 = sc.nextDouble();
    System.out.println("Digite a 2° notas: ");
    double nota2 = sc.nextDouble();
    System.out.println("Digite a 3° nota: ");
    double nota3 = sc.nextDouble();
    System.out.println("Digite a 4° nota: ");
    double nota4 = sc.nextDouble();

    System.out.println();
    System.out.println("Notas: ");
    System.out.println("1° nota: " + nota1);
    System.out.println("2° nota: " + nota2);
    System.out.println("3° nota: " + nota3);
    System.out.println("4° nota: " + nota4);
    System.out.println("Média: " + (nota1 + nota2 + nota3 + nota4) / 4);
}

// Q4)

public class Q4 {
    String vetor1[];
    int quant_consoantes;

    for (int i = 0; i <= 10; i++) {
            String caracter = sc.nextLine();
            if caracter.length() > 1 {
                System.out.println("Erro! Digite apenas um caracter.");
                i--;
            } else {
                vetor1[i] = caracter;
            }
        }

    for (int i = 0; i <= 10; i++) {
        if vetor1[i] != "a" && vetor1[i] != "e" && vetor1[i] != "i" && vetor1[i] != "o" && vetor1[i] != "u" && {
            System.out.println();
            System.out.println("A posição: " + i + " Tem uma consoante, que é: " + vetor1[]);
            quant_consoantes++;
        }
    }
}