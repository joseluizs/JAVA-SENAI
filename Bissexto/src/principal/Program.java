package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*
		 * 2)Fa�a um programa que pe�a para o usu�rio entrar com um ano e dizer se esse
		 * ano � bissexto ou n�o;
		 * 
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o ano para saber se � bissexto");
		int ano = sc.nextInt();

		if (ano % 4 == 0)
			System.out.println("Ano � bissexto: " + ano);
		else
			System.out.println("Ano n�o � bissexto: " + ano);

		sc.close();

	}

}
