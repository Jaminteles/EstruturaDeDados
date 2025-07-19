// Classe do nó da árvore
class No {
    int valor;
    No esquerda, direita;

    public No(int valor) {
        this.valor = valor;
        esquerda = direita = null;
    }
}

// Classe da Árvore Binária de Busca (BST)
class ArvoreBST {
    No raiz;

    // Inserção de um novo valor
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

    // Busca de um valor
    public boolean buscar(No raiz, int valor) {
        if (raiz == null) return false;
        if (raiz.valor == valor) return true;
        if (valor < raiz.valor) return buscar(raiz.esquerda, valor);
        return buscar(raiz.direita, valor);
    }

    // Exibição em ordem (in-order)
    public void emOrdem(No raiz) {
        if (raiz != null) {
            emOrdem(raiz.esquerda);
            System.out.print(raiz.valor + " ");
            emOrdem(raiz.direita);
        }
    }
}

// Classe principal
public class Main {
    public static void main(String[] args) {
        ArvoreBST arvore = new ArvoreBST();

        int[] valores = {50, 30, 70, 20, 40, 60, 80};
        for (int val : valores) {
            arvore.raiz = arvore.inserir(arvore.raiz, val);
        }

        System.out.print("Elementos em ordem: ");
        arvore.emOrdem(arvore.raiz);  // Deve imprimir em ordem crescente

        int busca = 60;
        System.out.println("\nO valor " + busca + " está na árvore? " + (arvore.buscar(arvore.raiz, busca) ? "Sim" : "Não"));
    }
}
