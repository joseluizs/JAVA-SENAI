package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// Faça um Programa que peça as 4 notas bimestrais e mostre a média.

		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite 1º nota: ");
		double nota = sc.nextDouble();
		
		System.out.println("Digite 2º nota: ");
		double nota2 = sc.nextDouble();
		
		System.out.println("Digite 3º nota: ");
		double nota3 = sc.nextDouble();

		System.out.println("Digite 4º nota: ");
		double nota4 = sc.nextDouble();
		
		double media = 0;
		media = (nota + nota2 + nota3 + nota4) / 4 ;

		System.out.println("A soma da 1º nota: " + nota 
								+ " + nota 2º: " + nota2 
								+ " + nota 3º: " + nota3 
								+ " + nota 4º: " + nota4 + " é : " + media);
		sc.close();
		
	}

}
