package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print(
				"Qual tipo de opera��o vc deseja (soma, divis�o, multiplica��o, subtra��o): ");
		String operacao = sc.nextLine();

		System.out.print("Digite o n�mero para a tabuada: ");
		int numero = sc.nextInt();

		System.out.println("Tabuada de " + numero + ":");

		switch (operacao) {
			case "soma" :
				for (int i = 1; i <= 10; i++) {
					System.out.println(numero + " + " + i + " = " + (i + numero));
				}
				break;

			case "divis�o" :
				for (int i = 1; i <= 10; i++) {
					System.out.println((i * numero) + " / " + numero + " = " + i);

				}
				break;

			case "multiplica��o" :
				for (int i = 1; i <= 10; i++) {
					System.out.println(numero + " x " + i + " = " + (i * numero));
				}
				break;

			case "subtra��o" :
				for (int i = 1; i <= 10; i++) {
					System.out.println((i + numero) + " - " + numero + " = " + i);
				}
				break;

			default :
				System.out.println("Opera��o inv�lida!");
		}

		sc.close();

	}

}
