package Lista1;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] idade = new int[5];
        double[] altura = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Insira a idade: ");
            idade[i] = sc.nextInt();
            System.out.println("Insira a altura: ");
            altura[i] = sc.nextDouble();
        }
        //idade
        for (int i = 4; i >= 0; i--) {
            if (i == 4) {
                System.out.print("Idade: ");
                System.out.print("[");
            }
            if (i != 0) {
                System.out.print(idade[i] + ", ");
            } else {
                System.out.print(idade[i]);
            }
            if (i == 0) {
                System.out.println("]");
            }
        }
        //Altura
        for (int i = 4; i >= 0; i--) {
            if (i == 4) {
                System.out.print("Altura: ");
                System.out.print("[");
            }
            if (i != 0) {
                System.out.print(altura[i] + ", ");
            } else {
                System.out.print(altura[i]);
            }
            if (i == 0) {
                System.out.println("]");
            }
        }
    }
}