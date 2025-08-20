/* 
ALGORITMOS DE ORDENAÇÃO POR TROCA
LISTA ORDENADAS
BUSCA DE DADOS

BUBBLE     SORT 
SELECTION  SORT 
INSERTION  SORT
*/
public class Ordenacao {
    int dados[] = (6,8,3,1,9,0,2,5);

    public void imprimirTela() {
        for (int dado: dados) {
            System.out.println(dado);
        }
    }
    public void bubbleSort() {
        for (int j = 0; j < dados.length-1; j++) {

            for (int i = 0; i < (dados.length-1)-j; i++) {
                if (dados[i] > dados[i+1]) {
                    troca(i, i+1);
                }
            }
        }
    }
        private void troca(int indice1, int indice2) {
        int temp = dados[indice1];
        dados[indice1] = dados[indice2];
        dados[indice2] = temp;
    }
    
    public static void main(String args[]) {
        
    }
}