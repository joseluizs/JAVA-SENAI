package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        double somaAltura = 0;

        System.out.println("Digite a altura de 5 pessoas:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Altura da pessoa " + (i + 1) + ": ");
            double altura = scanner.nextDouble();
            somaAltura += altura;
        }

        double mediaAltura = somaAltura / 5;

        System.out.println("A m�dia de altura das 5 pessoas �: " + mediaAltura);

        scanner.close();

	}

}
