package principal;

import javax.swing.JOptionPane;

public class Program {

	public static void main(String[] args) {
		String anoNasc = JOptionPane.showInputDialog(null, "Digite o ano do nascimento");
		int ano = Integer.parseInt(anoNasc);
		
		String anoAtual = JOptionPane.showInputDialog(null, "Digite o ano atual");
		int atual = Integer.parseInt(anoAtual);
		
		int idade = atual - ano;
		
		JOptionPane.showMessageDialog(null, "Sua idade é: " + idade );
	}
}
