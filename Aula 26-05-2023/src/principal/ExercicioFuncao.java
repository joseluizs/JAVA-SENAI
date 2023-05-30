package principal;

import java.util.Scanner;

public class ExercicioFuncao {

	public static void main(String[] args) {
		somaDoisNumeros(15, 5);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com 1� n�mero: ");
		int numero1 = sc.nextInt();
		System.out.println("Entre com 2� n�mero: ");
		int numero2 = sc.nextInt();
		
		somaDoisNumeros(numero1, numero2);
		System.out.println("Abaixo os n�meros que foram atribuidos manualmente!");
		somaDoisNumeros(10,	 20);
		
		sc.close();

	}
	
	static void somaDoisNumeros(int x, int y) {
		int resultado = x + y;
		System.out.println("O resultado da soma �: " + resultado);
		System.out.println("Outra forma de mostrar resultado da soma �: " + (x + y));
	}

}
