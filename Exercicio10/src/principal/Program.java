package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Recebendo os coeficientes a, b e c da equa��o ax^2 + bx + c = 0
		System.out.print("Digite o coeficiente a: ");
		double a = sc.nextDouble();
		System.out.print("Digite o coeficiente b: ");
		double b = sc.nextDouble();
		System.out.print("Digite o coeficiente c: ");
		double c = sc.nextDouble();

		// Calculando o delta
		double delta = b * b - 4 * a * c;

		// Verificando se a equa��o tem ra�zes reais
		if (delta < 0) {
			System.out.println("A equa��o n�o possui ra�zes reais.");
		} else if (delta == 0) {
			// Caso o delta seja zero, as ra�zes s�o iguais
			double x = -b / (2 * a);
			System.out.printf("A equa��o possui uma raiz real: x = %.2f\n", x);
		} else {
			// Caso o delta seja maior que zero, as ra�zes s�o diferentes
			double x1 = (-b + Math.sqrt(delta)) / (2 * a);
			double x2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.printf("A equa��o possui duas ra�zes reais: x1 = %.2f e x2 = %.2f\n", x1, x2);
		}
		sc.close();
	}

}
