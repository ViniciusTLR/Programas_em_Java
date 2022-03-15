package Carro;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Carro celta = new Carro();
		Carro gol = new Carro();
		Carro i30 = new Carro();
		Carro palio = new Carro();
		
		celta.setCor("azul");
		celta.setPorta(4);
		
		gol.setCor("verde");
		gol.setPorta(2);
		
		i30.setCor("amarelo");
		i30.setPorta(1);
		
		palio.setCor("vermelho");
		palio.setPorta(3);
		
		List<Carro> x = new ArrayList<Carro>();
		
		x.add(celta);
		x.add(gol);
		x.add(i30);
		x.add(palio);
		
		for(int i=0;i<x.size();i++) {
			switch(i) {
			case 0:
				System.out.println("Celta:");
				break;
			case 1:
				System.out.println("Gol:");
				break;
			case 2:
				System.out.println("I30:");
				break;
			case 3:
				System.out.println("Palio");
				break;
			default:
				break;
			}
			System.out.println("Cor: "+x.get(i).getCor());
			System.out.println("Portas: "+x.get(i).getPorta());
			System.out.println();
		}
	
	}
	
}
