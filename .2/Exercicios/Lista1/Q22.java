package Lista1;

public class Q22 {
    public static void main(String[] args) {
        char[] arr = {'a', 'x', 'e', 'o', 'p'};
        int contador = 0;

        for (char c : arr) {
            if ("aeiouAEIOU".indexOf(c) != -1) {
                contador++;
            }
        }

        System.out.println("Número de vogais: " + contador);
    }
}