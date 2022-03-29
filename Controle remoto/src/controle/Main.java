package controle;

public class Main {

	public static void main(String[] args) {
		ControleRemoto controleRemoto = new ControleRemoto(0, false, false);
		
		controleRemoto.ligar();
		controleRemoto.maisvolume();
		controleRemoto.pause();
		controleRemoto.abrimenu();
		controleRemoto.fecharmenu();
		
	}

}
