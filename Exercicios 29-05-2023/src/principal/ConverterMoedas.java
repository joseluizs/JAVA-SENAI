package principal;

import java.util.Scanner;

public class ConverterMoedas {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor em reais: ");
        double valorReais = sc.nextDouble();

        System.out.print("Digite a cotação atual do dólar: ");
        double cotacaoDolar = sc.nextDouble();

        double valorDolar = valorReais / cotacaoDolar;

        System.out.println("O valor em dólar é: $" + valorDolar);
        
        sc.close();

    }


}
