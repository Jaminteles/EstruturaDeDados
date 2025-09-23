package Lista2;

import java.util.Arrays;
public class Exercicio8 {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8};
        int fator = 3;

        System.out.println("Antes: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) arr[i] *= fator;

        System.out.println("Depois (multiplicado por " + fator + "): " + Arrays.toString(arr));
    }
}
