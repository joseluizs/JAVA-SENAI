package principal;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Double classe nativa
		Double[] notas = new Double[4];
		
		System.out.println("Entre com o nome do Aluno: ");
		String nomeAluno =  sc.nextLine();
		
		Double somaNotas = 0.0;
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Entre com a nota : " + (i + 1) + ": ");
			notas[i] = sc.nextDouble();
			somaNotas += notas[i];
			//somaNotas += ; vers�o mais curta dio c�digo			
		}
		System.out.println("A m�dia do aluno " + nomeAluno + " �: " + (somaNotas / notas.length));
		
		
		sc.close();

	}

}
