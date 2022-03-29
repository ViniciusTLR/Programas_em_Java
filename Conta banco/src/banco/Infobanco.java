package banco;

public class Infobanco {

	public int numconta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	public Infobanco() {
		this.setSaldo(0);
		this.setStatus(false);
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
		
	public int getNumconta() {
		return numconta;
	}

	public void setNumconta(int numconta) {
		this.numconta = numconta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void abrirconta(String t) {
		setTipo(t);
		setStatus(true);
		if (t == "cc") {
			saldo = 50;
		}else if (t == "cp") {
			saldo = 150;
		}
	}
	
	public void fecharconta() {
		if (saldo == 0) {
			System.out.println("Conta fechada com sucesso");
			status = false;
		}else if(saldo > 0) {
			System.out.println("Conta com dinheiro");
		}else {
			System.out.println("Conta em débito");
		}
	}
	
	public void depositar(float v) {
		if(status = true) {
			setSaldo(getSaldo() + v);
		}else {
			System.out.println("Impossivel depositar");
		}
	}
	
	public void sacar(int v) {
		if(status = true) {
			if(saldo > 0) {
			setSaldo(getSaldo() - v);
			}
		}else if(saldo == 0) {
			System.out.println("Voce não possui esse valor");
		}else {
			System.out.println("Impossivel fazer o saque");
		}
	}
	
	public void pagarmensal(){
		int v = 0;
		if(tipo == "cc") {
			v = 12;
		}else if (tipo == "cp") {
			v = 20;
		}
		if(status = true) {
			if(saldo > v) {
				saldo = saldo - v;
			}else {
				System.out.println("Saldo insuficinte");
			}
		}
	}
	
	public void estadoatual() {
		System.out.println("==============================");
		System.out.println("Conta: " + this.getNumconta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
	}
}


