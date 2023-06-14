package principal;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		List<Pessoa> listaPessoas = new ArrayList<>();
		
		int qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade Pessoas para adicionar a lista"));
		
		for (int i = 0; i < qtd; i++) {
			String nome = JOptionPane.showInputDialog("Digite nome da pessoa: ");
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da pessoa:"));
			String telefone = JOptionPane.showInputDialog("Digite telefone da pessoa: ");
			Pessoa novaPessoa = new Pessoa(nome, idade, telefone);
			listaPessoas.add(novaPessoa);
		}

        JOptionPane.showMessageDialog(null, listaPessoas);

	}

}
