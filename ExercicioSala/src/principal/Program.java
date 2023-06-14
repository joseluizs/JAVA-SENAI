package principal;

import java.util.ArrayList;
import java.util.List;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		List<Pessoa> listaPessoas = new ArrayList<>();
		
		Pessoa pessoa = new Pessoa("Luiz", 47, 998774681);
		Pessoa pessoa1 = new Pessoa("Luiz", 47, 998774681);
		Pessoa pessoa2 = new Pessoa("Luiz", 47, 998774681);
		Pessoa pessoa3 = new Pessoa("Luiz", 47, 998774681);
		
		listaPessoas.add(pessoa);
		listaPessoas.add(pessoa1);
		listaPessoas.add(pessoa2);
		listaPessoas.add(pessoa3);
		
		System.out.println(listaPessoas);

	}

}
