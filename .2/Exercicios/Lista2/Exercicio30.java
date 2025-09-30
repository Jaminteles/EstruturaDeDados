package Lista2;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Exercicio30 {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,3,5,1};
        LinkedHashSet<Integer> s = new LinkedHashSet<>();

        for (int v : arr) s.add(v);
        int[] unico = new int[s.size()];
        int i = 0;

        for (int v : s) unico[i++] = v;
        System.out.println("Sem repetidos: " + Arrays.toString(unico));
    }
}
