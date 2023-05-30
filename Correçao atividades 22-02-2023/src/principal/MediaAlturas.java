package principal;

import java.util.Scanner;

public class MediaAlturas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		 * double somaAltura =0; double altura = 0;
		 * 
		 * for (int contador = 1; contador <= 5; contador++) {
		 * System.out.println("Insira altura: "); altura = sc.nextDouble(); somaAltura
		 * += altura; }
		 * 
		 * System.out.println("A média das alturas é: " + (somaAltura / 5));
		 */
		
		double somaAltura = 0;
		double altura = 0;
		int contador = 0;
		
		while (contador < 5) {
			System.out.println("Insira a altura: " + (contador + 1));
			altura = sc.nextDouble();
			somaAltura += altura;
			contador++;
		}
		
		System.out.println("A média das alturas é : " + (somaAltura / contador));
		
		
		
		sc.close();
	}

}
