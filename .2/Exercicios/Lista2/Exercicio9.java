package Lista2;

public class Exercicio9 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,8,11};
        int count = 0;

        for (int v : arr) if (v % 2 == 0) count++;

        System.out.println("Quantidade de elementos pares: " + count);
    }
}
