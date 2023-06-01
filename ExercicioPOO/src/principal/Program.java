package principal;

import java.util.Scanner;

import entities.AreaTerreno;

/* Faça um programa com a classe AreaTerreno que tem o atributo area e o metodo retorna area com os atributos
	largura e comprimento. Na calsse principal peça para o usuario entrar com os dados de
	largura e comprimento e retorne o valor do calculo feito no metodo da classe AreaTerreno */

public class Program {

	public static void main(String[] args) {
		AreaTerreno areaTerreno =  new AreaTerreno();
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Digite a largura do terreno: ");
		areaTerreno.largura = sc.nextDouble();
		
		System.out.print("Digite a comprimento do terreno: ");
		areaTerreno.largura = sc.nextDouble();
		
		System.out.println("Calculo feito: " + areaTerreno.retornaArea());	

		sc.close();

	}

}
