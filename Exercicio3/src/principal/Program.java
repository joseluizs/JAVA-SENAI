package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// Faça um Programa que peça dois números e imprima a soma;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite 1º número: ");
		int num = sc.nextInt();
		
		System.out.println("Digite 2º número: ");
		int num2 = sc.nextInt();
		
		double soma = 0;
		soma = num + num2;

		System.out.println("A soma do 1º: " + num + " + do 2º: " + num2 + " é : " + soma);
		sc.close();
	}

}
