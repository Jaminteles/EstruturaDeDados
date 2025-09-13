import java.util.Scanner;
import java.util.Arrays;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A1 = new int[10];
        int[] A2 = new int[10];
        int[] B = new int[20];

        for (int i = 0; i < 10; i++) {
            System.out.println("Insira o número do primeiro vetor: ");
            A1[i] = sc.nextInt();
            System.out.println("Insira o número do segundo vetor: ");
            A2[i] = sc.nextInt();
        }

        int j = 0;
        for (int i = 0; i < 20; i++) {
            B[j] = A1[i];
            j++;
            B[j] = A2[i];
            j++;
        }

        System.out.println(Arrays.toString(B));
    }
}