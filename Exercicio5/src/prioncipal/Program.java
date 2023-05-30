package prioncipal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. 
		// Calcule e mostre o total do seu salário no referido mês.
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor por hora: ");
		double valor = sc.nextDouble();
		
		System.out.println("Digite o total de horas trabalhada: ");
		double horas = sc.nextInt();
		
		double soma = valor * horas ;

		System.out.println("A soma das horas trabalhadas é : " + soma);
		sc.close();

	}

}
