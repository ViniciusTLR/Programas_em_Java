package aula1_2;

public class Televisao {
	
	boolean funciona ;
	boolean ligada;
	String cor;
	int polegadas;
	
	void mostrar() {
		System.out.println("funciona"+this.funciona);
		System.out.println("ligada"+this.ligada);
		System.out.println("cor"+this.cor);
		System.out.println("polegadas"+this.polegadas);
	}
	
	void ligar() {
		this.ligada = true;
	}
	
	void desligar() {
		this.ligada = false;
	}

}

    
