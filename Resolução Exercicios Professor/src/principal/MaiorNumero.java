package principal;

import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n1, n2, n3;

		System.out.println("Entre com 1� numero ");
		n1 = sc.nextInt();
		System.out.println("Entre com 2� numero ");
		n2 = sc.nextInt();
		System.out.println("Entre com 3� numero ");
		n3 = sc.nextInt();

	/*	if (n1 > n2 && n1 > n3) {
			System.out.println("O maior � o 1� " + n1);
		}
		if (n2 > n1 && n2 > n3) {
			System.out.println("O maior � o 2� " + n2);
		}
		if (n3 > n1 && n3 > n2) {
			System.out.println("O maior � o 3� " + n3);
		}
	*/
		if (n1 > n2 && n1 > n3) {
			System.out.println("O 1� � maior: " + n1);
		} else if (n2 > n3) {
			System.out.println("O 2� � maior: " + n2);
		} else {
			System.out.println("O 3� � maior: " + n3);
		}

		sc.close();

	}

}
