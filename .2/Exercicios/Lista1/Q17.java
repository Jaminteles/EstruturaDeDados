package Lista1;
import java.util.Arrays;

public class Q17 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};

        boolean iguais = Arrays.equals(arr1, arr2);
        System.out.println("Arrays são iguais? " + iguais);
    }
}