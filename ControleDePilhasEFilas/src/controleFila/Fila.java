package controleFila;

public class Fila {
	
	private int[] valores;
	private int primeiro;
	private int ultimo;
	private int total;
	
	public Fila() {
		valores = new int[10];
		primeiro = 0;
		ultimo = 0;
		total = 0;
	}
	//colocar na fila
	public void inserir(int elemento) {
		if(isFull()) {
			throw new RuntimeException("Fila Cheia! Nao da pra inserir");
		}
		valores[ultimo] = elemento;
		ultimo = (ultimo + 1) % valores.length;
		total++;
	}
	//retirar da fila
	public int retirar() {
		if(isEmpty()) {
		throw new RuntimeException("Fila vazia! Nao da pra retirar ninguem");
		}
		int elemento = valores[primeiro];
		primeiro = (primeiro + 1) % valores.length;
		total--;
		return elemento;
	}
	//verificar se esta vazia
	public boolean isEmpty() {
		return total == 0;
	}
	//verificar se esta cheia
	public boolean isFull() {
		return total == valores.length;
	}
	
}
