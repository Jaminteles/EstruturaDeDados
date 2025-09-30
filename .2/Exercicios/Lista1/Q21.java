package Lista1;
import java.util.Arrays;

public class Q21 {
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c', 'e', 'i', 'o', 'u'};

        for (int i = 0; i < arr.length; i++) {
            if ("aeiouAEIOU".indexOf(arr[i]) != -1) {
                arr[i] = '*';
            }
        }

        System.out.println("Resultado: " + Arrays.toString(arr));
    }
}