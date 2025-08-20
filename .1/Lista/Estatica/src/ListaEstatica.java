//inserir(0, "Azul");

anexar("Azul");
anexar("Verde");
anexar("Amarelo");
anexar("Branco");

//LISTAS ESTÁTICAS 

//construtores
//inserir         //C
//anexar          //C //feito


//selecionar      //R
@Override
public Object selecionar (int posicao) {
    Object aux = null;
    if (!estaVazia()) {
        //posicao e valida
        if (posicao >= 0 && posicao < quantidade) {
            int posicaoFisica = mapeamento(logica);
            aux = dados[posicaoFisica];
        } else {
            System.out.println("Invalid Index!");
        }
    } else {
        System.out.println("List is empty!");
        }
    return aux;
}

    int primeiraOcorrencia(Object dado);

    boolean contem(Object dado)

    public void limpar() {
        quantidade = 0;
        ponteiroInicio = 0;
        ponteiroFim = -1;
    }

@Override
public Object [] selecionarTodos() {
    if (!estaVazia()) {
        Object[] dadosAux = new Object[quantidade];
        int ponteiroAux = ponteiroInicio;
        for(int i = 0; i < quantidade; i++) {
        dadosAux[i] = dados[ponteiroInicio+i];
        ponteiroAux = avancar(ponteiroAux);
    }
    }
}