package principal;

import javax.swing.JOptionPane;

import entities.Funcionario;
import entities.Gerente;
import entities.Secretaria;

public class Program {

	public static void main(String[] args) {

		int opcao;
		String funcionariosCadastrados = "";

		do {
			Funcionario funcionario;

			String nome = JOptionPane.showInputDialog("Digite o nome do funcionário:");
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do funcionário:"));
			String sexo = JOptionPane.showInputDialog("Digite o sexo do funcionário:");
			String departamento = JOptionPane.showInputDialog("Digite o cargo de funcionário (Gerente ou Secretaria):");
			double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do funcionário:"));
			
			// Verificar o tipo de funcionário e criar a instância adequada
			if (departamento.equalsIgnoreCase("Gerente")) {
				funcionario = new Gerente(nome, idade, sexo, departamento, salario);
			} else if (departamento.equalsIgnoreCase("Secretaria")) {
				funcionario = new Secretaria(nome, idade, sexo, departamento, salario);
			} else {
				funcionario = new Funcionario(nome, idade, sexo, departamento, salario);
			}

			// Aplicar a bonificação de acordo com o tipo de funcionário
			if (funcionario instanceof Gerente) {
				((Gerente) funcionario).aplicarBonificacao();
			} else if (funcionario instanceof Secretaria) {
				((Secretaria) funcionario).aplicarBonificacao();
			}

			// Adicionar as informações do funcionário à lista de funcionários cadastrados
			funcionariosCadastrados += funcionario.toString() + "\n--------------------\n";

			// Perguntar se deseja cadastrar mais um funcionário
			opcao = JOptionPane.showConfirmDialog(null, "Deseja cadastrar mais um funcionário?", "Confirmação",
					JOptionPane.YES_NO_OPTION);
		} while (opcao == JOptionPane.YES_OPTION);

		// Exibir a lista de funcionários cadastrados
		JOptionPane.showMessageDialog(null, funcionariosCadastrados);

	}
}
