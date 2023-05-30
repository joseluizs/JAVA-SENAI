package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		//usado quando sabemos a quantidade de vezes que ira repetir
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("------------------------------------");
		
		//usado quando NÃO sabemos a quantidade de vezes que ira repetir
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i++;
		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Deseja Continuar? ");
		char opcao = sc.next().charAt(0);
		int j = 0;
		while (Character.toUpperCase(opcao) == 'S') {

;
			System.out.print("Deseja Continuar? ");
			opcao = sc.next().charAt(0);
		}
		System.out.println("Entrou no While: " + j);
		
		//DoWhile garante que será executado o bloco de código ao menos uma vez
		int k = 0;
		do {
			System.out.println("Deseja continuar: ");
			opcao = sc.next().charAt(0);
			k++;
		} while (Character.toUpperCase(opcao) == 'S');
		System.out.println("Entrou no do while: " + k);
		
		
		sc.close();

	}

}
