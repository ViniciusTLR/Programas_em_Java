package controlePilha;

public class pilha {
	
	int elementos[];
	int topo;
	public pilha() {
		elementos = new int[10];
		topo = -1; //posi��o inv�lida do vetor
	}

	//coloca na pilha
	public void push(int e) {
		if(isFull()) {
			throw new RuntimeException("Stack Overflow!");
		}
		topo++;
		elementos[topo] = e;
	}
	
	//retira da pilha
	public int pop() {
		if(isEmpty()) {
			throw new RuntimeException("Empty Stack!");
		}
		int e;
		e = elementos[topo];
		topo--;
		return e;
	}
	
	//verifica se a pilha est� vazia
	public boolean isEmpty() {
		return (topo == -1);
	}
	
	//verifica se a pilha est� cheia
	public boolean isFull() {
		return (topo == 9); //ou no lugar do 9 posso por length
	}
	
	//retornar o elemento do topo da pilha
	public int top() {
		if(isEmpty()) {
			throw new RuntimeException("Empty Stack!");
		}
		return elementos[topo];
	}
}
