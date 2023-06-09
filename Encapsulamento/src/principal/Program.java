package principal;

import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Conta conta =  new Conta();
		System.out.println("Titular");
		conta.setTitular(sc.nextLine());
		
		System.out.println("Agencia");
		conta.setAgencia(sc.nextInt());
		
		System.out.println("N�mero da conta");
		conta.setNumeroConta(sc.nextInt());
		
		System.out.println("Entre com o valor a depositar");
		double deposito = sc.nextDouble();
		conta.depositar(deposito);
		
		System.out.println("Entre com o valor a sacar");
		double sacar = sc.nextDouble();
		conta.sacar(sacar);

		System.out.println(conta);
		
		sc.close();

	}

}
