package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		//Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int num = sc.nextInt();
		
		System.out.println("Número digitado: " + num);
		sc.close();
		
	}

}
