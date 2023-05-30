package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Recebendo os tr�s lados do tri�ngulo
		System.out.print("Digite o lado 1 do tri�ngulo: ");
		double lado1 = sc.nextDouble();
		System.out.print("Digite o lado 2 do tri�ngulo: ");
		double lado2 = sc.nextDouble();
		System.out.print("Digite o lado 3 do tri�ngulo: ");
		double lado3 = sc.nextDouble();

		// Verificando se � um tri�ngulo
		if (lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2 || lado2 + lado3 <= lado1) {
			System.out.println("N�o � um tri�ngulo.");
		} else {
			// Verificando o tipo de tri�ngulo
			if (lado1 == lado2 && lado2 == lado3) {
				System.out.println("� um tri�ngulo equil�tero.");
			} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
				System.out.println("� um tri�ngulo is�sceles.");
			} else {
				System.out.println("� um tri�ngulo escaleno.");
			}
		}
		sc.close();
	}

}
