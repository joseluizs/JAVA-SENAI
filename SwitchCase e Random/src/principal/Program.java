package principal;

import java.util.Random;

public class Program {

	public static void main(String[] args) {

		Random random = new Random();

		int opcao = random.nextInt(8) + 1;

		System.out.println(opcao);

		// String opcao = "Sexta-Feira";

		switch (opcao) {
		case 1:
			System.out.println("O Corresponde a Domingo");
			break;
		case 2:
			System.out.println("O Corresponde a Segunda");
			break;
		case 3:
			System.out.println("O Corresponde a Terça");
			break;
		case 4:
			System.out.println("O Corresponde a Quarta");
			break;
		case 5:
			System.out.println("O Corresponde a Quinta");
			break;
		case 6:
			System.out.println("O Corresponde a Sexta");
			break;
		case 7:
			System.out.println("O dia selecionado é Sábado");
			break;

		default:
			System.out.println("Não correspode a um dia da semana");
			break;
		}
	}

}
