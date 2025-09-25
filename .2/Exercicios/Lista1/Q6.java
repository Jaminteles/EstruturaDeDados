package Lista1;

import java.util.Scanner;
import java.util.Arrays;

public class Q6 {

    public static double calcularMedia(double n1, double n2, double n3, double n4) {
        return (n1 + n2 + n3 + n4) / 4.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota;
        int AlunoMedia = 0;

        double[] media = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Insira as notas do aluno");
            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();
            double n3 = sc.nextDouble();
            double n4 = sc.nextDouble();

            media[i] = calcularMedia(n1, n2, n3, n4);
        }

        for (int i = 0; i < 10; i++) {
            if (media[i] >= 7) {
                AlunoMedia++;
            }
        }

        System.out.println("Quantidade de alunos que passaram na media: " + AlunoMedia);
    }
}