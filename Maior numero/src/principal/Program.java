package principal;

import java.util.Scanner;

public class Program {
	
	/*
	 * 1)Fa�a um programa que leia 3 n�meros e mostre o maior deles;
	 * 
	 * **/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Recebendo os tr�s lados do tri�ngulo
		System.out.print("Digite 1� valor: ");
		double v1 = sc.nextDouble();
		System.out.print("Digite 2� valor: ");
		double v2 = sc.nextDouble();
		System.out.print("Digite 3� valor: ");
		double v3 = sc.nextDouble();

		// Verificando 1� valor
		if (v1 > v2 && v1 > v3 ) {
			System.out.println("1� valor � maior. " + v1);
			
			// Verificando 2� valor
		} else 	if (v2 > v1 && v2 > v3) {
				System.out.println("2� valor � maior. " + v2);
		}
		else {
			// Verificando 3� valor
			System.out.println("3� valor � maior. " + v3);
		}
		sc.close();

	}

}
