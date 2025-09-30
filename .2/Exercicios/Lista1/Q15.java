package Lista1;
import java.util.*;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList notas = new ArrayList();
        double v = 0;
        int j = 0;
        double soma = 0;
        int acimaMedia = 0;
        int abaixoMedia = 0;

        while (v == -1) {
            v = sc.nextDouble();
            notas.add(j, v);
            j++;
        }

        notas.get(notas.size());
        System.out.println("Quantidade de valores que foram lidos: " + notas.size());
        System.out.println(Arrays.toString(notas.toArray()));   //Ordem normal
        for (int i = notas.size() - 1; i >= 0; i--) {
            System.out.println(notas.get(i));   //Ordem inversa
        }

        for (int i = 0; i < notas.size(); i++) {
            double num = (double) notas.get(i);
            soma += num;
        }

        System.out.println("Soma total das notas: " + soma);

        soma /= notas.size();
        System.out.println("Soma total das notas: " + soma);

        for  (int i = 0; i < notas.size(); i++) {
            if (soma > (double) notas.get(i)) {
                acimaMedia++;
            }
            if (7 > (double) notas.get(i)) {
                abaixoMedia++;
            }
        }
        System.out.println("Acima da média: " + acimaMedia);
        System.out.println("Valores abaixo de sete: " + abaixoMedia);
        System.out.println("Você chegou ao final do programa, parabéns");
    }
}
