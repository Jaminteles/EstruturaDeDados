package Lista2;

public class Exercicio11 {
    public static void main(String[] args) {
        double[] arr = {2.5, 3.0, 4.5, 10.0};
        double soma = 0;

        for (double v : arr) soma += v;
        double media = soma / arr.length;

        System.out.println("Média: " + media);
    }
}
