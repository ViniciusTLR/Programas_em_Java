package aula1_2;

public class Main {

	public static void main(String[] args) {
		Televisao televisao1 = new Televisao();
		
		televisao1.funciona = true;
		televisao1.ligada = false;
		televisao1.cor = "Preta";
		televisao1.polegadas = 47;
		
		System.out.println("Televisao 1: ");
		System.out.println("Funciona:" +televisao1.funciona);
		System.out.println("Ligada: "+televisao1.ligada);
		System.out.println("Cor: "+televisao1.cor);
		System.out.println("Polegadas: "+televisao1.polegadas);
		
		Televisao televisao2 = new Televisao();
		
		televisao2.funciona = false;
		televisao2.ligada = true;
		televisao2.cor = "Preta";
		televisao2.polegadas = 47;
		
		if(televisao2.funciona == false) {
			televisao2.ligada = false;
		}
		
		System.out.println("");
		
		System.out.println("Televisao 2: ");
		System.out.println("Funciona:" +televisao2.funciona);
		System.out.println("Ligada: "+televisao2.ligada);
		System.out.println("Cor: "+televisao2.cor);
		System.out.println("Polegadas: "+televisao2.polegadas);
		

	}

}
