package principal;

import entities.Carro;

public class Program {

	public static void main(String[] args) {
		
		Carro carro = new Carro();
		Carro carro2 = new Carro();
		
		carro.modelo = "Celta";
		carro.ano = 2022;
		carro.cor = "Vermelho";
		carro.marca = "GM";
		
		carro2.modelo = "Gol";
		carro2.ano  = 2023;
		carro2.cor = "Azul";
		carro2.marca = "VW";
		
		
		System.out.println("Carro: " + carro.modelo + "\nAno: " +  carro.ano + "\nCor: " +  carro.cor +"\nMarca:" +  carro.marca);
		System.out.println();
		System.out.println("Carro: " + carro2.modelo + "\nAno: " +  carro2.ano + "\nCor: " +  carro2.cor +"\nMarca:" +  carro2.marca);

	}

}
