package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// Fa�a um Programa que pe�a as 4 notas bimestrais e mostre a m�dia.

		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite 1� nota: ");
		double nota = sc.nextDouble();
		
		System.out.println("Digite 2� nota: ");
		double nota2 = sc.nextDouble();
		
		System.out.println("Digite 3� nota: ");
		double nota3 = sc.nextDouble();

		System.out.println("Digite 4� nota: ");
		double nota4 = sc.nextDouble();
		
		double media = 0;
		media = (nota + nota2 + nota3 + nota4) / 4 ;

		System.out.println("A soma da 1� nota: " + nota 
								+ " + nota 2�: " + nota2 
								+ " + nota 3�: " + nota3 
								+ " + nota 4�: " + nota4 + " � : " + media);
		sc.close();
		
	}

}
