package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print(
				"Qual tipo de operação vc deseja (soma, divisão, multiplicação, subtração): ");
		String operacao = sc.nextLine();

		System.out.print("Digite o número para a tabuada: ");
		int numero = sc.nextInt();

		System.out.println("Tabuada de " + numero + ":");

		switch (operacao) {
			case "soma" :
				for (int i = 1; i <= 10; i++) {
					System.out.println(numero + " + " + i + " = " + (i + numero));
				}
				break;

			case "divisão" :
				for (int i = 1; i <= 10; i++) {
					System.out.println((i * numero) + " / " + numero + " = " + i);

				}
				break;

			case "multiplicação" :
				for (int i = 1; i <= 10; i++) {
					System.out.println(numero + " x " + i + " = " + (i * numero));
				}
				break;

			case "subtração" :
				for (int i = 1; i <= 10; i++) {
					System.out.println((i + numero) + " - " + numero + " = " + i);
				}
				break;

			default :
				System.out.println("Operação inválida!");
		}

		sc.close();

	}

}
