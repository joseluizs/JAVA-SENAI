package principal;

import java.util.Random;

public class SorteioGanhador {
    public static void main(String[] args) {
    	
    	//Vetor de nomes
        String[] pessoas = {"Luiz", "Cris", "Hadassa", "Esther", "Marques",
                            "Bete", "Magie", "Chico", "Chica", "Max"};

        //variável para sorteio
        Random random = new Random();
        int indiceGanhador = random.nextInt(pessoas.length);

        //variável do ganhador
        String ganhador = pessoas[indiceGanhador];
        System.out.println("O ganhador é: " + ganhador);
    }
}
