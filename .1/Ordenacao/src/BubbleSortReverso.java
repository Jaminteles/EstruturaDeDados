public class BubbleSortReverso {

    public static void bubbleSortInverso(int[] array) {
        int n = array.length;
        boolean trocou;

        for (int i = 0; i < n - 1; i++) {
            trocou = false;

            for (int j = n - 1; j > i; j--) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                    trocou = true;
                }
            }

            if (!trocou) break;
        }
    }

    public static void imprimirArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numeros = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Antes da ordenação:");
        imprimirArray(numeros);

        bubbleSortInverso(numeros);

        System.out.println("Depois da ordenação:");
        imprimirArray(numeros);
    }
}
