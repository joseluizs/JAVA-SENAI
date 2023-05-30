package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*
		 * Fa�a um programa que receba o tipo de opera��o a ser realizada (soma,
		 * divis�o, multiplica��o, subtra��o) e imprima a tabuada desse n�mero. ex.: 1x2
		 * = 2, 1x3 = 3...
		 */
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Digite a op��o desejada: 'soma', 'divis�o', 'multiplica��o', 'subtra��o'");
		String opcao = sc.nextLine();
		System.out.println("Digite o n�mero para a tabuada: ");
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
			case "multiplica��o":
				System.out.println(numero + " * " + i + " = " + " : " + (numero * i));
				break;
			case "subtra��o":
				System.out.println(numero + " - " + i + " = " + " : " + (numero - i));
				break;
	
			default:
				System.out.println("Opera��o invalida!");
			}
		}
		
		sc.close();

	}

}
