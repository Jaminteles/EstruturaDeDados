package Lista2;

public class Exercicio3 {
    public static void main(String[] args) {
        int N = 10;
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) arr[i] = N - i;

        System.out.println("Array em ordem inversa:");

        for (int v : arr) System.out.print(v + " ");
        System.out.println();
    }
}
