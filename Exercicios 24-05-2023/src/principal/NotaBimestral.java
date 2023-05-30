package principal;

import java.util.Scanner;

public class NotaBimestral {

	/*Fa�a um programa que receba o nome do
	aluno e as 4 notas bimestrais desse aluno e mostre a media;*/
		
		public static void main(String[] args) {
	        // Ler nome do aluno
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Digite o nome do aluno: ");
	        String nomeAluno = sc.nextLine();

	        // Ler notas bimestrais
	        double[] notasBimestrais = new double[4];
	        for (int i = 0; i < 4; i++) {
	            System.out.print("Digite a nota do " + (i + 1) + "� bimestre: ");
	            notasBimestrais[i] = sc.nextDouble();
	        }

	        // C�lcular m�dia bimestral
	        double somaNotas = 0;
	        for (double nota : notasBimestrais) {
	            somaNotas += nota;
	        }
	        double mediaBimestral = somaNotas / notasBimestrais.length;

	        // Exibir o resultado
	        System.out.println("M�dia bimestral do(a) aluno(a) " + nomeAluno + ": " + mediaBimestral);
	        sc.close();

	}

}
