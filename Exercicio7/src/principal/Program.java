package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor e graus em Celsius: ");
		int C = sc.nextInt();
		
		int F = (C * 9 / 5) + 32;

		System.out.println("Os Graus em Celsius é : " + F);
		sc.close();

	}

}
