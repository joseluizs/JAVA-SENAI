package principal;

import java.util.Scanner;

import entities.Pessoa;

public class Program {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Pessoa pessoa = new Pessoa();
		
		System.out.print("Digite seu nome: ");
		pessoa.nome = sc.next();
		
		System.out.print("Digite ano do nascimento: ");
		int ano = sc.nextInt();
		pessoa.retornaIdade(ano);		
		System.out.print("Digite o sexo 'M' ou 'F': ");
		pessoa.sexo = sc.next().charAt(0);
		
		
		
		System.out.println("\nNome: " + pessoa.nome + "\nIdade: " + pessoa.idade + "\nSexo: " + pessoa.sexo);
		
		sc.close();
	}

}
