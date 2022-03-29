package banco;

public class Main {

	public static void main(String[] args) {
		
		Infobanco infobanco1 = new Infobanco();
		
		infobanco1.setNumconta(1234);
		infobanco1.setDono("Yasmim");
		infobanco1.abrirconta("cc");
		
		infobanco1.depositar(300);
		infobanco1.sacar(100);
		infobanco1.pagarmensal();
		
		infobanco1.estadoatual();
		
		Infobanco infobanco2 = new Infobanco();
		
		infobanco2.setNumconta(4321 );
		infobanco2.setDono("Epaminondas");
		infobanco2.abrirconta("cp");
		
		infobanco2.depositar(500);
		infobanco2.pagarmensal();
		
		
		infobanco2.estadoatual();
	
	}

}
