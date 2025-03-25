public class PilhaEstatica implements Empilhavel {

	//variáveis de instância
	private Object[] array;
	private int ponteiroTopo;
	//métodos
	//construtores
	public PilhaEstatica() {
	    this(10);
	}

	public PilhaEstatica(int tamanho) {
	    dados = new Object[tamanho];
	    ponteiroTopo = -1;

	}
	//métodos principais
	@Override
	public void empilhar(Object dado) {
	   if (!estaCheia()) {
		ponteiroTopo++;
		dados[ponteiroTopo] = dado;
	} else {
		System.err.println("Stack is full");
	}

	}
	
	@Override
	public Object desempilhar() {
	   Object aux = null;
	   if (!estaVazia()) {
		aux = dados[ponteiroTopo];
		ponteiroTopo--;
	   } else {
		System.out.println("Stack is empty!");
	}
	return aux;
	}
	
	@Override
	public Object temp = pilha.desempilhar() {
	
	}

	@Override
	public Object espiar() {
	   Object aux = null;
	   if (!estaVazia()) {
		aux = dados[ponteiroTopo];
	   } else {
		System.out.println("Stack is empty!");
	}
	return aux;
	}

	@Override
	public void atualizar(Object dado) {
	if (!estaCheia()) {
		dados[ponteiroTopo] = dado;
	} else {
		System.err.println("Stack is full");
	}
	}

	//métodos auxiliares
	@Override
	public boolean estaCheia() {
	    return (ponteiroTopo == dados.length -1);
	}

	@Override
	public boolean estaVazia() {
	    return (ponteiroTopo == -1);
	}

	@Override
	public String imprimir() {
	    String aux = "[";
	    for (int i = 0; i >= ponteiroTopo; i--) {
		if (i == 0) {
		   aux += dados[i];
		} else 
		   aux += dados[i]+",";
	        }
	    }
	    return aux + "]";
	}

}

