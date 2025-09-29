package Lista2;
import java.util.Arrays;

public class Exercicio21 {
    public static void main(String[] args) {
        char[] arr = {'a','b','e','i','o','u','x','y'};
        System.out.println("Antes: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            char c = Character.toLowerCase(arr[i]);
            if ("aeiou".indexOf(c) >= 0) arr[i] = '*';
        }

        System.out.println("Depois: " + Arrays.toString(arr));
    }
}
