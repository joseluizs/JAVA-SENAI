package principal;

import java.util.Scanner;

public class Program {

	/*
	 * Faça um programa que leia 4 notas de um aluno e retorne a media, se media
	 * maior que 5 e menor que 6 reprovado, se media entre 6 e 7 recuperação, se
	 * media acima de 7 aprovado, se media 10 aprovado com honras;
	 * 
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Recebendo os três lados do triângulo
		System.out.print("Digite 1° nota: ");
		double v1 = sc.nextDouble();
		System.out.print("Digite 2° nota: ");
		double v2 = sc.nextDouble();
		System.out.print("Digite 3° nota: ");
		double v3 = sc.nextDouble();
		System.out.print("Digite 4° nota: ");
		double v4 = sc.nextDouble();

		double media = (v1 + v2 + v3 + v4) / 4;

		if (media >= 10) {
			System.out.println("Aluno Aprovado com Honras. " + media);
		} else if (media >= 8 && media <= 9) {
			System.out.println("Aluno Aprovado. " + media);
		} else if (media >= 6 && media <= 7) {
			System.out.println("Aluno recuperação. " + media);
		} else {
			System.out.println("Aluno reprovado. " + media);
		}
		sc.close();

	}

}
