package entities;

public class Conta {
	
	private int numeroConta;
	private int agencia;
	private double saldo;
	private String titular;
	
	
	
	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void depositar(double valorDepositado) {
		saldo += valorDepositado;
	}

	public void sacar(double valorSacadado) {
		saldo -= valorSacadado;
	}
	
	@Override //Significa sobreescreva 
	public String toString() {
		return "Titular: " + titular // titular é um atributo
				+ "\nAgencia: " + agencia 
				+ "\nConta: " + numeroConta
				+ "\nSaldo: " + saldo;
 	}
	

}
