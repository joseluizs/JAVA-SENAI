package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*
		 * 2)Faça um programa que peça para o usuário entrar com um ano e dizer se esse
		 * ano é bissexto ou não;
		 * 
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o ano para saber se é bissexto");
		int ano = sc.nextInt();

		if (ano % 4 == 0)
			System.out.println("Ano é bissexto: " + ano);
		else
			System.out.println("Ano não é bissexto: " + ano);

		sc.close();

	}

}
