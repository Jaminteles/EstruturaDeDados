package Lista2;

public class Exercicio25 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,1};
        boolean pal = true;

        for (int i = 0; i < arr.length/2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                pal = false; break;
            }
        }
        System.out.println("É palíndromo? " + pal);
    }
}
