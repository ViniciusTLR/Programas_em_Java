package controle;

	//Atributos
public class ControleRemoto implements Controlador{
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	//Métodos Especiais
	
	public ControleRemoto(int volume, boolean ligado, boolean tocando) {
		super();
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
	}
	
	private int getVolume() {
		return volume;
	}
	
	private void setVolume(int volume) {
		this.volume = volume;
	}
	private boolean getLigado() {
		return ligado;
	}
	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	private boolean getTocando() {
		return tocando;
	}
	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	
	//Métodos Abstratos
	
	@Override
	public void ligar() {
		this.setLigado(true);
		this.setTocando(true);
	}

	@Override
	public void desligar() {
		this.setLigado(false);
		this.setTocando(false);
	}

	@Override
	public void abrimenu() {
		System.out.println("========Menu========");
		System.out.println("Ligado? " + this.getLigado()); 
		System.out.println("Tocando? " + this.getTocando());
		System.out.println("Volume: " + this.getVolume());
		for(int i=1; i <= this.getVolume() ; i+=10) {
			System.out.print("|");
		}
	}

	@Override
	public void fecharmenu() {
		System.out.println("");
		System.out.println("Fechando menu");
	}

	@Override
	public void maisvolume() {
		if(this.getLigado()) {
			this.setVolume(this.getVolume()+10);
		}
	}

	@Override
	public void menosvolume() {
		if(this.getLigado()) {
			this.setVolume(this.getVolume()-1);
		}
	}

	@Override
	public void ligarmudo() {
		if(this.getLigado() && this.getVolume()>0) {
			this.setVolume(0);
		}
	}

	@Override
	public void desligarmudo() {
		if(this.getLigado() && this.getVolume()<=0) {
			this.setVolume(50);
		}
	}

	@Override
	public void play() {
		if(this.getLigado() && !(this.getTocando())) {
			this.setTocando(true);
		}
	}

	@Override
	public void pause() {
		if(this.getLigado() && this.getTocando()) {
			this.setTocando(false);
		}
	}

}
