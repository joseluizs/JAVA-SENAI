package principal;

import java.util.Scanner;

public class Contadora {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int contador = 0;
		int opcao = 0;
		
		/*
		 * System.out.println("Deseja entrar no la�o?  1 = S  ou 2 N"); opcao =
		 * sc.nextInt();
		 * 
		 * while (opcao == 1) { contador++;
		 * System.out.println("Deseja entrar no la�o?");
		 * System.out.println("1 = S  ou 2 N "); opcao = sc.nextInt(); }
		 */
		
		do {
			contador++;
			System.out.println("Deseja entrar no la�o?  1 = S  ou 2 N");
			System.out.println("1 = S  ou 2 N ");
			opcao = sc.nextInt();
		} while (opcao == 1);		
		System.out.println("Entrou " + contador + " vezes! ");
		
		sc.close();

	}

}
