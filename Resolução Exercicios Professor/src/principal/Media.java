package principal;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com a 1� nota:");
		double n1 = sc.nextDouble();
		System.out.println("Entre com a 2� nota:");
		double n2 = sc.nextDouble();
		System.out.println("Entre com a 3� nota:");
		double n3 = sc.nextDouble();
		System.out.println("Entre com a 4� nota:");
		double n4 = sc.nextDouble();

		double media =(n1 + n2+ n3+ n4) / 4;
		
		if (media <6 ) {
			System.out.println("Reprovado! media: " + media);
		}
		else if (media >= 6 && media < 7) {
			System.out.println("Recupera��o! media: " + media);
		}else if (media >= 7 && media < 10) {
			System.out.println("Aprovado! media: " + media);
		}else {
			System.out.println("Aprovado! com honras media: " + media);
		}
		
		
		sc.close();
	}

}
