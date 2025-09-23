package Lista2;

public class Exercicio6 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,10};
        int soma = 0;

        for (int v : arr) soma += v;

        System.out.println("Soma dos elementos: " + soma);
    }
}
