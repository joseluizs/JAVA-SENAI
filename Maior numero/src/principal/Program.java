package principal;

import java.util.Scanner;

public class Program {
	
	/*
	 * 1)Faça um programa que leia 3 números e mostre o maior deles;
	 * 
	 * **/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Recebendo os três lados do triângulo
		System.out.print("Digite 1° valor: ");
		double v1 = sc.nextDouble();
		System.out.print("Digite 2° valor: ");
		double v2 = sc.nextDouble();
		System.out.print("Digite 3° valor: ");
		double v3 = sc.nextDouble();

		// Verificando 1º valor
		if (v1 > v2 && v1 > v3 ) {
			System.out.println("1º valor é maior. " + v1);
			
			// Verificando 2º valor
		} else 	if (v2 > v1 && v2 > v3) {
				System.out.println("2º valor é maior. " + v2);
		}
		else {
			// Verificando 3º valor
			System.out.println("3º valor é maior. " + v3);
		}
		sc.close();

	}

}
