package principal;

import java.util.Scanner;

public class Bisexto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o ano pra saber se é bissexto:");
		int ano = sc.nextInt();
		
		if (ano % 4 == 0 && ano % 100 != 0 && ano % 400 == 0) {
			System.out.println("É bissexto: ");
		}
		else {
			System.out.println("O ano não é bissexto: ");
		}
		
		sc.close();

	}

}
