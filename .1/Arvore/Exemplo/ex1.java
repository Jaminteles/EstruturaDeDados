public class ex1 {
    public static void main(String[] args) {
        ArvoreBST arvore = new ArvoreBST();

        int[] valores = {50, 30, 70, 20, 40, 60, 80};
        for (int val : valores) {
            arvore.raiz = arvore.inserir(arvore.raiz, val);
        }

        System.out.print("Elementos em ordem: ");
        arvore.emOrdem(arvore.raiz);

        int busca = 60;
        System.out.println("\nO valor " + busca + " está na árvore? " + (arvore.buscar(arvore.raiz, busca) ? "Sim" : "Não"));
    }
}
