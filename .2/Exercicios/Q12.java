import java.util.Scanner;
import java.util.Arrays;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] altura = new double[30];
        int[] idade = new int[30];
        double media = 0;
        int menorQueMedia = 0;

        for (int i = 0; i < altura.length; i++) {
            System.out.println("Insira a altura do " + i+1 + "° aluno:");
            altura[i] = sc.nextDouble();
        }

        for (int i = 0; i < idade.length; i++) {
            System.out.println("Insira a idade do " + i+1 + "° aluno:");
            idade[i] = sc.nextInt();
        }

        for (double v : altura) {
            media += v;
        }

        media = media / altura.length;

        for  (int i = 0; i < idade.length; i++) {
            if (idade[i] > 13) {
                if (altura[i] < media) {
                    menorQueMedia += 1;
                }
            }
        }
    }
}