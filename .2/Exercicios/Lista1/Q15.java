package Lista1;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.Arrays;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList notas = new ArrayList();
        double v = 0;
        int i = 0;

        while (v == -1) {
            v = sc.nextDouble();
            notas.add(i, v);
            i++;
        }

        notas.get(notas.size());
        System.out.println(Arrays.toString(notas.toArray()));
    }
}
