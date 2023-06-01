package principal;

import java.util.Scanner;

import entities.AreaDoTerreno;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite a largura do terreno: ");
        double largura = sc.nextDouble();

        System.out.print("Digite o comprimento do terreno: ");
        double comprimento = sc.nextDouble();

        AreaDoTerreno terreno = new AreaDoTerreno();
        terreno.calcularArea(largura, comprimento);

        double area = terreno.getArea();
        System.out.println("A área do terreno é: " + area + " metros quadrados.");

        sc.close();

	}

}
