package Lista2;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        int[] arr = {5,8,2,9,1};
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor a buscar: ");
        int x = sc.nextInt();
        boolean found = false;

        for (int v : arr) if (v == x) { found = true; break; }

        System.out.println(found ? "Presente" : "Não presente");
        sc.close();
    }
}
