package principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<>();
		//Adiciona dados na lista
		nomes.add("Luiz");
		nomes.add("Cris");
		nomes.add("Esther");
		nomes.add("Só");
		nomes.add("Lá");
		nomes.add("Si");
		nomes.add("Dó");
		nomes.add("Ré");
		
		// mostra dados da lista
		for (String nome : nomes) {
			System.out.println("Nome: " + nome);
		}
		
		// remove dados da lista
		nomes.remove(2);
		for (String nome : nomes) {
			System.out.println("Nome: " + nome);
		}
		
		System.out.println(nomes.contains("Cris"));
		System.out.println(nomes.isEmpty());
		
		//obtem dados da lista por indice
		System.out.println(nomes.get(3));
		System.out.println(nomes);
		
		String dado = nomes.stream().filter(x -> x == "Luiz").findFirst().orElse(null);
		System.out.println(dado);
		
		Collections.sort(nomes);
		System.out.println("Imprimindo em ordem alfabética!");
		System.out.println(nomes);
		for (String nome : nomes) {
			System.out.println("Nome: " + nome);
		}
	}

}
