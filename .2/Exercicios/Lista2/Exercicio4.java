package Lista2;

public class Exercicio4 {
    public static void main(String[] args) {
        int[] arr = {12, 5, 99, -3, 45, 0};
        int max = arr[0], min = arr[0];

        for (int v : arr) {
            if (v > max) max = v;
            if (v < min) min = v;
        }

        System.out.println("Maior: " + max);
        System.out.println("Menor: " + min);
    }
}
