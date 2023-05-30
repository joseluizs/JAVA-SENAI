package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		int n1 = 10;
		int n2 = 25;
		boolean verdadeiro = false;
		
		if (n1 > n2) {
			System.out.println("N1 maior " + n1);
		}else {
			System.out.println("N2 maior " + n2);
		}
		
		if ( verdadeiro == true) {
			System.out.println("Verdadeiro");
		}else {
			System.out.println("Falso");
		}
		
		
		//Exemplo usando resto da divisão
		Scanner sc = new Scanner(System.in);
		
		int numero;
		System.out.println("Entre com um número pra saber se é par ou impar"
				+ "");
		numero = sc.nextInt();
		
		if (numero %2 == 0 ) {
			System.out.println("Numero par");
		}else {
			System.out.println("Número impar");
		}
		
		sc.close();

	}

}
