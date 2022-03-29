package rinhaDeHumano;

public class Lutadores {
	
	//Atributos
	private String nome;
	private String nacionalidade;
	private int idade;
	private double altura;
	private double peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empate;
	
	//Métodos especiais
	
	public Lutadores(String no, String na, int id, double al, double pe, int vi,
			int de, int em) {
		super();
		this.nome = no;
		this.nacionalidade = na;
		this.idade = id;
		this.altura = al;
		this.setPeso(pe);
		this.vitorias = vi;
		this.derrotas = de;
		this.empate = em;
		
		
	}
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getNacionalidade() {
		return nacionalidade;
	}


	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
		this.setCategoria();
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria() {
		if (peso < 32.2) {
			this.categoria = "inválido";
		}else if(peso <= 70.3) {
			this.categoria = "Leve";
		}else if(peso <= 83.9) {
			this.categoria = "Médio";
		}else if(peso <= 120.2) {
			this.categoria = "Pesado";
		}else {
			this.categoria = "Inválido";
		}
		
	}


	public int getVitorias() {
		return vitorias;
	}


	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}


	public int getDerrotas() {
		return derrotas;
	}


	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}


	public int getEmpate() {
		return empate;
	}


	public void setEmpate(int empate) {
		this.empate = empate;
	}

	
	//Métodos

	public void apresentar() {
		System.out.println("Lutador: " + this.getNome());
		System.out.println("Origem: " + this.getNacionalidade());
		System.out.println("Idade: " + this.getIdade() + "anos");
		System.out.println("Altura: " + this.getAltura() + "m");
		System.out.println("Pesando: " + this.getPeso() + "kg");
		System.out.println("Ganhou: " + this.getVitorias());
		System.out.println("perdeu: " + this.getDerrotas());
		System.out.println("empatou: " + this.getEmpate());
	}
	
	public void status(){
		System.out.println(this.getNome());
		System.out.println("é um peso: "+ this.getCategoria());
		System.out.println(this.getVitorias() + " Vitórias");
		System.out.println(this.getDerrotas() + " Derrotas");
		System.out.println(this.getEmpate() + " Empates");
	}
	
	public void ganharluta() {
		this.setVitorias(this.getVitorias() + 1);
	}
	
	public void perderluta() {
		this.setDerrotas(this.getDerrotas() + 1);
	}
	
	public void empatarluta(){
		this.setEmpate(this.getEmpate() + 1);
	}
	
}
