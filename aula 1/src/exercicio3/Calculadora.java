package exercicio3;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		int num1, num2, resul=0;
		int operadores;
		
		System.out.println("Digite dois numeros: ");
		
		Scanner scan = new Scanner (System.in);
		
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		
		System.out.println("O que voce deseja fazer com eles?");
		System.out.println("1 para somar, 2 para subtrair");
		System.out.println("3 para multiplicar, 4 para dividir");
		
		operadores = scan.nextInt();
		
		switch(operadores) {
			case 1:
				resul = num1 + num2;
				System.out.println("A soma de "+num1+" + "+num2+" é = "+resul);
				break;
			case 2:
				resul = num1 - num2;
				System.out.println("A subtracao de "+num1+" - "+num2+" é = "+resul);
				break;
			case 3:
				resul = num1 * num2;
				System.out.println("A multiplicacao de "+num1+" X "+num2+" é = "+resul);
				break;
			case 4:
				resul = num1 / num2;
				System.out.println("A divisao de "+num1+" / "+num2+" é = "+resul);
				break;
			default:
				System.out.println("Operacao nao existente");
		}
		
	}

}
