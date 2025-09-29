package Lista2;

public class Exercicio22 {
    public static void main(String[] args) {
        char[] arr = {'a','b','c','e','i','o','u','z'};
        int count = 0;

        for (char ch : arr) if ("aeiouAEIOU".indexOf(ch) >= 0) count++;

        System.out.println("Número de vogais: " + count);
    }
}
