package Lista1;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] vetor1 = new String[10];
        int quant_consoantes = 0;

        for (int i = 0; i < 10; i++) {
            String caracter = sc.nextLine();
            if (caracter.length() > 1) {
                System.out.println("Erro! Digite apenas um caracter.");
                i--;
            } else {
                vetor1[i] = caracter;
            }
        }

        for (int i = 0; i < 10; i++) {
            String c = vetor1[i].toLowerCase();
            if (!c.equals("a") && !c.equals("e") && !c.equals("i") && !c.equals("o") && !c.equals("u")) {
                System.out.println();
                System.out.println("A posição: " + i + " Tem a consoante: " + vetor1[i]);
                quant_consoantes++;
            }
        }
        System.out.println("Total de consoantes: " + quant_consoantes);
    }
}