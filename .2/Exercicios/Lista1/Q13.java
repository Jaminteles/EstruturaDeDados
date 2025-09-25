package Lista1;

import java.util.Scanner;
import java.util.Arrays;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] tempMeses = new double[12];
        double mediaAnual = 0;
        String[] meses = {"Janeiro", "Fevereiro", "Abril", "Março", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        for  (int i = 0; i < tempMeses.length; i++) {
            tempMeses[i] = sc.nextDouble();
            mediaAnual += tempMeses[i];
        }
        mediaAnual = mediaAnual / tempMeses.length;
        System.out.println(mediaAnual);

        for  (int i = 0; i < tempMeses.length; i++) {
            if (tempMeses[i] > mediaAnual) {
                System.out.println("O mês de " + meses[i] + " teve a media mensal de temperatura maior que a media anual. Sendo ela: " + tempMeses[i] + "° de média.");
            }
        }
    }
}
