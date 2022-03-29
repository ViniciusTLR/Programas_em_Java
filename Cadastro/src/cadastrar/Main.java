package cadastrar;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("*****Bem vindo a seçao de cadastro.*****");
		
		Scanner scan = new Scanner(System.in);
		
		int criar=1;
		
		while(criar==1) {
			
		switch(criar) {
		case 1:
			
			Login nome = new Login();
			System.out.println("Digite seu nome de Usuario:");
			nome.setUsuario(scan.next());
			System.out.println("Digite sua senha:");
			nome.setSenha(scan.next());
			
			System.out.println("Cadrasto finalizado com sucesso.");
			
			System.out.println("Para realizar um novo cadastro, tecle 1");
			System.out.println("Para encerrar, tecle 0: ");
			criar = scan.nextInt();
			break;
		
		case 0:
			
			System.out.println("cadrasto finalizado");
			break;
		
		default:
			
			System.out.println("tecle 1 ou 0");
			}
		}
	}

}
