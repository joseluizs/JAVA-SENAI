package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// Fa�a um Programa que pe�a dois n�meros e imprima a soma;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite 1� n�mero: ");
		int num = sc.nextInt();
		
		System.out.println("Digite 2� n�mero: ");
		int num2 = sc.nextInt();
		
		double soma = 0;
		soma = num + num2;

		System.out.println("A soma do 1�: " + num + " + do 2�: " + num2 + " � : " + soma);
		sc.close();
	}

}
