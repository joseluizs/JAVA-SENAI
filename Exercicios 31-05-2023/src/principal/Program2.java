package principal;

import java.util.Scanner;

import entities.Triangulo;

public class Program2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do lado 1: ");
        double lado1 = scanner.nextDouble();

        System.out.println("Digite o valor do lado 2: ");
        double lado2 = scanner.nextDouble();

        System.out.println("Digite o valor do lado 3: ");
        double lado3 = scanner.nextDouble();

        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
        String tipoTriangulo = triangulo.verificarTipoTriangulo();
        System.out.println("O triângulo é: " + tipoTriangulo);

        scanner.close();

	}

}
