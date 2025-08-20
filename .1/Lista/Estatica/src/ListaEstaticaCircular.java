public class ListaEstaticaCircular implements Listavel {
    private int ponteiroInicio; 
	private int ponteiroFim;
	private Object[] dados;
	private int quantidade;
	
	public ListaEstaticaCircular() {
		this(10);
	}
	
    public ListaEstaticaCircular(int tamanho) {
		ponteiroInicio = 0;
		ponteiroFim = -1;
		quantidade = 0;		
		dados = new Object[tamanho];
	}

    public void anexar(Object dado) {
        	if (!estaCheia()) {
			    ponteiroFim++;			
			if (ponteiroFim == dados.length) {
				ponteiroFim = 0;
			}
			quantidade++;
			dados[ponteiroFim] = dado;			
		    } else {
			    System.err.println("Lista Cheia!");
		}			
	}
    
    void atualizar (Object dado, int posicao) {
        if(!estaVazia()) {
            if (posicao >= 0 && posicao < quantidade) {
                posicaoFisica = mapeamento (posicao);
                dados (posicaoFisica) = dado;
            } else
        }
    }
}
