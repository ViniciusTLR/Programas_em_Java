package aula1;

public class Main {

	public static void main(String[] args) {
		
		Caneta caneta1 = new Caneta();
		
		caneta1.cor = "azul";
		caneta1.transparente = true;
		caneta1.funciona = false;
		caneta1.quantidade_cores = 1;
		
		Caneta caneta2 = new Caneta();
		caneta2.cor = "Preta, azul, vermelho";
		caneta2.transparente = false;
		caneta2.funciona = true;
		caneta2.quantidade_cores = 3;
		
		System.out.println("Caneta 1:");
		System.out.println(caneta1.cor);
		System.out.println(caneta1.transparente);
		System.out.println(caneta1.funciona);
		System.out.println(caneta1.quantidade_cores);
		
		System.out.println(" ");
		
		System.out.println("Caneta 2:");
		System.out.println(caneta2.cor);
		System.out.println(caneta2.transparente);
		System.out.println(caneta2.funciona);
		System.out.println(caneta2.quantidade_cores);
		
	}

}
