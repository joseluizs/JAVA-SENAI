package principal;

import java.util.Random;

/*Fa�a um programa para gerar 3 n�meros aleat�rios para 3 dados, mostre a soma dos n�meros que sa�ram. 
Se 2 dados sa�rem com a mesma numera��o o jogador ganha 2 pontos de b�nus, se os 3 dados sa�rem com a 
mesma numera��o ele ganha 6 pontos de b�nus e deve aparecer a mensagem "voc� � muito sortudo". 
Se o total da soma dos dados mais o b�nus for menor que 15 o jogador perde e apresenta a mensagem 
"Lamento, mas voc� perdeu" , se for maior ou igual a 15 ele ganha e apresenta a mensagem "parab�ns, voc� ganhou!" .*/

public class Program {

	public static void main(String[] args) {

		Random random = new Random();

		int d1 = random.nextInt(6) + 1;
		int d2 = random.nextInt(6) + 1;
		int d3 = random.nextInt(6) + 1;
		
		int soma = d1 + d2 + d3;
		int bonus = 0;
		
		if (d1 == d2 && d1 == d3) {
			bonus = 6;
			System.out.println("voc� � muito sortudo a soma dos dados �: " + soma);
		}else if (d1 == d2) {
			bonus = 2;
			System.out.println();
		}
		
		int total = soma + bonus;
		if (total < 15) {
			System.out.println("Lamento, mas voc� perdeu ");
		}else if (total >= 15 ) {
			System.out.println("Parab�ns, voc� ganhou! ");
		}
		
		System.out.println("Dados: " + d1 + " , " + d2 + " , " + d3);
		System.out.println("Total : " + total);
		
	}

}
