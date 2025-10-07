package Maven.src.main.java.com.example;

/** 
 * Implementação de uma pilha dinamica generica
 * 
 * @param T, tipo de dado que será armazenado na pilha
 * @author Jamínteles Desus
 * @version 1.0
 * @since 06/10/2025
 */
public class LinkedStack<T> implements Stackable<T> {
    private DoubleNode<T> topPointer;   /** Aponta para o topo da pilha */
    private int numberElements;         /** Indica o numero de elementos atual da pilha */
    private int maxElements;            /** Indica o numero maximo de elementos que a pilha suporta */

    /**
     * Construtor vazio, cria uma pilha com até 10 slots
     */
    public LinkedStack() {
        this(10);
    }

    /**
     * Construtor que recebe um inteiro
     * 
     * @param maxElements, contem o número maximo de elementos que pode conter a pilha
     */
    public LinkedStack(int maxElements) {
        topPointer = null;
        numberElements = 0;
        this.maxElements = maxElements;
    }

    /** Verifica se a pila esta vazia 
     * @return retorna true se a pilha estiver vazia
    */
    @Override
    boolean isEmpty() {
        return numberElements == 0;
    }

    /** Verifica se a pilha está cheia  
     * @return retorna true se a pilha estiver cheia
    */
    @Override
    boolean isFull() {
        return numberElements == maxElements;
    }

    public T pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
        numberElements--;
        auxData = topPointer.getData();
        topPointer = topPointer.getPrevious();
        topPointer.setNext(null);
        return auxData;
    }

    @Override
    public push(T data) {
        if (isFull()) {
            throw new NoSuchElementException("Stack is full");
        }
        DoubleNode<T> newNode = new DoubleNode<>();
        newNode.setData(data);
        topPointer.setNext(newNode);
        newNode.setPrevious(topPointer);
        topPointer = newNode;
        numberElements++;
    }

    /**
     * Atualizar na pilha
     * 
     * @param newData
     */
    @Override
    public void update(T newData) {
        pop();
        push(newData);
    }
    
    @Override
    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Pilha está vazia");
        } else {
            return topPointer.getData();
        }
    }
    /**
     * Imprime os elementos da pilha
     * 
     * @return String com os dados entre colchetes separados por virgula
     */
    public String print() {
        String result = "";
        DoubleNode<T> auxPointer = topPointer;
        for (int i = 0; i < numberElements; i++) {
            result += auxPointer.getData();
            auxPointer = auxPointer.getPrevious();
            if (i != numberElements - 1) {
                result += ",";
            }
        }
        return "[" + result + "]";
    }
}
