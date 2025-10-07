package com.example;

public interface Stackable<T> {
    /**
	 * Adiciona um elemento ao topo da pilha.
	 *
	 * @param dado o elemento a ser adicionado
	 * @throws java.util.NoSuchElementException se a pilha estiver cheia
	 */
	void push(T dado);
	
	/**
	 * Remove e retorna o elemento do topo da pilha.
	 *
	 * @return o elemento removido do topo
	 * @throws java.util.NoSuchElementException se a pilha estiver vazia
	 */
	T pop();
	
	/**
	 * Retorna o elemento do topo da pilha sem removê-lo.
	 *
	 * @return o elemento do topo
	 * @throws java.util.NoSuchElementException se a pilha estiver vazia
	 */
	T peek();
	
	/**
	 * Retorna um array contendo todos os elementos da pilha.
	 * O elemento do topo será o último elemento do array.
	 *
	 * @param dado o elemento substituirá o elemento do topo
	 * @throws java.util.NoSuchElementException se a pilha estiver vazia
	 */
	void update(T dado);
	
	/**
	 * Verifica se a pilha está cheia.
	 *
	 * @return true se a pilha estiver cheia, false caso contrário
	 */
	boolean isFull();
	
	/**
	 * Verifica se a pilha está vazia.
	 *
	 * @return true se a pilha estiver vazia, false caso contrário
	 */
	boolean isEmpty();
	
	/**
	 * Retorna uma representação em string da pilha.
	 * Os elementos são separados por vírgula e delimitados por colchetes.
	 * O elemento do topo será o último elemento na string.
	 *
	 * @return string representando a pilha
	 */
	String print();
}
