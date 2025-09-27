package Lista2;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio20 {
    public static void main(String[] args) {
        String[] arr = {"maçã","banana","maçã","pera","uva","maçã"};
        Scanner sc = new Scanner(System.in);

        System.out.print("Texto a remover: ");
        String alvo = sc.nextLine();
        ArrayList<String> lista = new ArrayList<>();

        for (String s : arr) if (!s.equals(alvo)) lista.add(s);
        String[] resultado = lista.toArray(new String[0]);
        System.out.println("Resultado: " + Arrays.toString(resultado));
        sc.close();
    }
}
