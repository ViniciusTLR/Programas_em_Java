package rinhaDeHumano;

import java.util.Random;

public class Luta {
	
	//Atributos
	private Lutadores desafiado;
	private Lutadores desafiante;
	private int rounds;
	private boolean aprovada;
	
	//metodos
	public void marcarluta(Lutadores l1, Lutadores l2) {
		if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
			aprovada = true;
			desafiado = l1;
			desafiante = l2;
		}else {
			aprovada = false;
			desafiante = null;
			desafiado = null;
		}
	}
	
	public void lutar() {
		if(this.aprovada) {
			System.out.println("### Desafiado ###");
			this.desafiado.apresentar();
			System.out.println("### Desafiante ###");
			this.desafiante.apresentar();
			
			Random Aleatorio = new Random();
			int vencedor = Aleatorio.nextInt(3); // 0 1 2
			System.out.println("##### Resultado da luta #####");
			switch(vencedor) {
				case 0: // Empante
					System.out.println("empatou");
					this.desafiado.empatarluta();
					this.desafiante.empatarluta();
					break;
				case 1: // Desafiado vence
					System.out.println(this.desafiado.getNome() + "venceu");
					this.desafiado.ganharluta();
					this.desafiante.perderluta();
					break;
				case 2: // Desafiante vence
					System.out.println(this.desafiante.getNome() + "Venceu");
					this.desafiante.ganharluta();
					this.desafiado.perderluta();
					break;
			}
			System.out.println("#####################");
		}else {
			System.out.println("A luta não pode acontecer");
		}
	}

	
	//metodos especiais
	
	public Lutadores getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutadores desafiado) {
		this.desafiado = desafiado;
	}

	public Lutadores getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutadores desafiante) {
		this.desafiante = desafiante;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean isAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	
}
