package principal;

import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n1, n2, n3;

		System.out.println("Entre com 1º numero ");
		n1 = sc.nextInt();
		System.out.println("Entre com 2º numero ");
		n2 = sc.nextInt();
		System.out.println("Entre com 3º numero ");
		n3 = sc.nextInt();

	/*	if (n1 > n2 && n1 > n3) {
			System.out.println("O maior é o 1º " + n1);
		}
		if (n2 > n1 && n2 > n3) {
			System.out.println("O maior é o 2º " + n2);
		}
		if (n3 > n1 && n3 > n2) {
			System.out.println("O maior é o 3º " + n3);
		}
	*/
		if (n1 > n2 && n1 > n3) {
			System.out.println("O 1º é maior: " + n1);
		} else if (n2 > n3) {
			System.out.println("O 2º é maior: " + n2);
		} else {
			System.out.println("O 3º é maior: " + n3);
		}

		sc.close();

	}

}
