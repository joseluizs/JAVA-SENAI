package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Recebendo os três lados do triângulo
		System.out.print("Digite o lado 1 do triângulo: ");
		double lado1 = sc.nextDouble();
		System.out.print("Digite o lado 2 do triângulo: ");
		double lado2 = sc.nextDouble();
		System.out.print("Digite o lado 3 do triângulo: ");
		double lado3 = sc.nextDouble();

		// Verificando se é um triângulo
		if (lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2 || lado2 + lado3 <= lado1) {
			System.out.println("Não é um triângulo.");
		} else {
			// Verificando o tipo de triângulo
			if (lado1 == lado2 && lado2 == lado3) {
				System.out.println("É um triângulo equilátero.");
			} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
				System.out.println("É um triângulo isósceles.");
			} else {
				System.out.println("É um triângulo escaleno.");
			}
		}
		sc.close();
	}

}
