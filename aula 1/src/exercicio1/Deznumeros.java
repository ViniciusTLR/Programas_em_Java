package exercicio1;

import java.util.Scanner;

public class Deznumeros {

	 static int numeros;
	 static int i;
	
	public static void main(String[] args) {
		System.out.println("Digite 10 numeros: ");
		
	Scanner scan = new Scanner (System.in); 
	
	for(i=0;i<10;i++){
		 numeros = scan.nextInt();
	}
	}
	
}
