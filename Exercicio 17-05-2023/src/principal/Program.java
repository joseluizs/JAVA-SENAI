package principal;

import java.util.Random;

/*Faça um programa para gerar 3 números aleatórios para 3 dados, mostre a soma dos números que saíram. 
Se 2 dados saírem com a mesma numeração o jogador ganha 2 pontos de bônus, se os 3 dados saírem com a 
mesma numeração ele ganha 6 pontos de bônus e deve aparecer a mensagem "você é muito sortudo". 
Se o total da soma dos dados mais o bônus for menor que 15 o jogador perde e apresenta a mensagem 
"Lamento, mas você perdeu" , se for maior ou igual a 15 ele ganha e apresenta a mensagem "parabéns, você ganhou!" .*/

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
			System.out.println("você é muito sortudo a soma dos dados é: " + soma);
		}else if (d1 == d2) {
			bonus = 2;
			System.out.println();
		}
		
		int total = soma + bonus;
		if (total < 15) {
			System.out.println("Lamento, mas você perdeu ");
		}else if (total >= 15 ) {
			System.out.println("Parabéns, você ganhou! ");
		}
		
		System.out.println("Dados: " + d1 + " , " + d2 + " , " + d3);
		System.out.println("Total : " + total);
		
	}

}
