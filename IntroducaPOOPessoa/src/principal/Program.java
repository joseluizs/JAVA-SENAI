package principal;

import entities.Pessoa;

public class Program {
	
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.nome = "Luiz";
		pessoa.idade = 47;
		pessoa.sexo = 'M';
		
		System.out.println("Nome: " + pessoa.nome + "\nIdade: " + pessoa.idade + "\nSexo: " + pessoa.sexo);
		
	}

}
