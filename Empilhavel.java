public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}

/*
TIPOS DE DADOS
NUMERICOS (positivos ou negativos)
	INTEIROS
		unsigned int;
		tinyint, smallint
		INT
		long, LONGINT, BIGINT sql
	PONTOS FLUTUANTES
		FLOAT
		DOUBLE
	PONTO FIXO NUMERIC OU DECIMAL SQL

	string = "instituto";
	char = 'A'; //unicode ascii
	lógico boolean
	pessoa["nome"]
	
	ponteiro
	referencia

	vetor  array matriz unidimensional
	arrays ordinais
	arrays associativos (dicionario) map

Conjunto   //set

	set a, b;
	a.union(b);

//Contrato
//Stack Stackable
//C -> Create (Criar)
//R -> Read (Ler)
//U -> Update (Atualizar)
//D -> Delete (Apagar)
//S -> Sort (Ordenar)

*/

public interface Empilhavel {
	//operações principais
	void empilhar(Object dado); //push
	Object desempilhar(); //pop
	
	Object temp = pilha.desempilhar();
	
	Object espiar(); //peek
	void atualizar(Object dado);
	//operações auxiliares
	Boolean estaCheia(); //isFull //overflow
	Boolean estaVazia(); //isFull //underflow
	String imprimir(); //print
}
