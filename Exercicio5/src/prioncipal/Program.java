package prioncipal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// Fa�a um Programa que pergunte quanto voc� ganha por hora e o n�mero de horas trabalhadas no m�s. 
		// Calcule e mostre o total do seu sal�rio no referido m�s.
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor por hora: ");
		double valor = sc.nextDouble();
		
		System.out.println("Digite o total de horas trabalhada: ");
		double horas = sc.nextInt();
		
		double soma = valor * horas ;

		System.out.println("A soma das horas trabalhadas � : " + soma);
		sc.close();

	}

}
