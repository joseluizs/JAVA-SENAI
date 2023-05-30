package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*
		 * Faça um programa que receba o tipo de operação a ser realizada (soma,
		 * divisão, multiplicação, subtração) e imprima a tabuada desse número. ex.: 1x2
		 * = 2, 1x3 = 3...
		 */
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Digite a opção desejada: 'soma', 'divisão', 'multiplicação', 'subtração'");
		String opcao = sc.nextLine();
		System.out.println("Digite o número para a tabuada: ");
		int numero = sc.nextInt();
		
		
		System.out.println("Tabuada de " + numero + ":");
		for (int i = 1; i <= 10; i++) {
			
			switch (opcao) {
			case "soma":
				System.out.println(numero + " + " + i + " = " + " : " + (numero + i));
				break;
			case "divisao":
				System.out.println(numero + " / " + i + " = " + " : " + ((numero * i) / i));
				break;
			case "multiplicação":
				System.out.println(numero + " * " + i + " = " + " : " + (numero * i));
				break;
			case "subtração":
				System.out.println(numero + " - " + i + " = " + " : " + (numero - i));
				break;
	
			default:
				System.out.println("Operação invalida!");
			}
		}
		
		sc.close();

	}

}
