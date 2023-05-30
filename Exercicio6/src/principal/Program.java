package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// Faça um Programa que peça a temperatura em graus Fahrenheit, 
		// transforme e mostre a temperatura em graus Celsius. C-5 ((F-32)/9).

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor e graus em Fahrenhit: ");
		int F = sc.nextInt();
		
		int C = 5 *((F - 32) / 9);

		System.out.println("Os Graus em Celsius é : " + C);
		sc.close();
		
		
	}

}
