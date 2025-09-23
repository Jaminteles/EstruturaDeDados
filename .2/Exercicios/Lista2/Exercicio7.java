package Lista2;

public class Exercicio7 {

    public static void main(String[] args) {
        int[] arr = {10, 11, 12, 13, 14, 15};
        int soma = 0;

        for (int i = 0; i < arr.length; i += 2) soma += arr[i];
        System.out.println("Soma dos elementos em posições pares: " + soma);
    }
}
