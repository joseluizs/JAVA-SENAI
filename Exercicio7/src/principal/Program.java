package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// Fa�a um Programa que pe�a a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor e graus em Celsius: ");
		int C = sc.nextInt();
		
		int F = (C * 9 / 5) + 32;

		System.out.println("Os Graus em Celsius � : " + F);
		sc.close();

	}

}
