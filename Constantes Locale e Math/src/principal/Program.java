package principal;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		//Constantes � quando seu valor n�o muda!
		final double PI = 3.1415;
		
		int v1 = 50;
		int v2 = 65;
		
		//realiza a potencia
		System.out.println(Math.pow(2, 2));
		
		//passagem de 2 n�meros como par�metro
		//retorna o max deles+
		System.out.println(Math.max(v1, v2));
		
		//passagem de 2 n�meros como par�metro
		//inverso do max, pega o minimo deles
		System.out.println(Math.min(5, 20));
		
		//retorna  a raiz quadrada de um n�mero
		System.out.println(Math.sqrt(18));
		
		//arredonda o n�mero para mais ou para menos
		System.out.println(Math.round(25.6542));

		//podemos realizar calculos com valores 
		//retomados pelo calcilo de Mat
		System.out.println(2 + Math.sqrt(18));
		
		Scanner sc = new Scanner(System.in);
		
		Locale ponto = new Locale("en", "us");
		
		System.out.println("Entre com o valor do dolar: ");
		
		double dolar = sc.useLocale(ponto).nextDouble();
		System.out.println("Valor digitado: " + dolar);
		
		String nome = "Luiz";
		char sexo = 'M';
		int idade = 32;
		double altura  = 1.83338414;
		
		System.out.printf("O meu nome � %s, "
				+ "sou do sexo %c, tenho %d anos, minha altura"
				+ "� %.2f", nome, sexo, idade, altura);

		/**
		 * Operadores de compara��o
		 * > maior que
		 * < menor que
		 * >= maior ou igual a
		 * <= menor ou igual a
		 * != diferente de 
		 * == igual a
		 * 
		 */
		
		
		/*
		 * Operadores l�gicos
		 * 
		 *&& = e
		 *|| = ou 
		 *!  = nega��o 
		 *
		 * */
		
		/*
		 * && E
		|___V___|___F____|___F_____|
		|___F___|___V____|___F_____|
		|___V___|___V____|___V_____|
		|___F___|___F____|___F_____|
		|__________________________|
		 * || OU

		
		
		*/
		
		
		
		sc.close();
	
	}

}
