package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		//Fa�a um Programa que pe�a um n�mero e ent�o mostre a mensagem O n�mero informado foi [n�mero].;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		int num = sc.nextInt();
		
		System.out.println("N�mero digitado: " + num);
		sc.close();
		
	}

}
