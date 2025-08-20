public class ArvoreBST {
    No raiz;

    public No inserir(No raiz, int valor) {
        if (raiz == null) {
            return new No(valor);
        }

        if (valor < raiz.valor) {
            raiz.esquerda = inserir(raiz.esquerda, valor);
        } else if (valor > raiz.valor) {
            raiz.direita = inserir(raiz.direita, valor);
        }

        return raiz;
    }

    public boolean buscar(No raiz, int valor) {
        if (raiz == null) return false;
        if (raiz.valor == valor) return true;
        if (valor < raiz.valor) return buscar(raiz.esquerda, valor);
        return buscar(raiz.direita, valor);
    }

    public void emOrdem(No raiz) {
        if (raiz != null) {
            emOrdem(raiz.esquerda);
            System.out.print(raiz.valor + " ");
            emOrdem(raiz.direita);
        }
    }
}