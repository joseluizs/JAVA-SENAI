package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pessoa pessoa;
		List<Pessoa> pessoas = new ArrayList<>();
		char opcao;
		
		do {
			pessoa = new Pessoa();
			System.out.print("Nome:");
			pessoa.setNome(sc.nextLine());
			System.out.print("Telefone");
			pessoa.setTelefone(sc.nextLine());
			System.out.print("Idade:");
			pessoa.setIdade(sc.nextInt());
			pessoas.add(pessoa);
			System.out.print("Deseja cadastrar mais uma pessoa");
			System.out.println("s/n");
			opcao = sc.next().charAt(0);
			sc.nextLine();
			
		} while (Character.toLowerCase(opcao) == 's');
		
		for (Pessoa p : pessoas) {
			System.out.println(p);
		}
		
		sc.close();

	}

}
