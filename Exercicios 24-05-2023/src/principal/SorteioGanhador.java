package principal;

import java.util.Random;

public class SorteioGanhador {
    public static void main(String[] args) {

        // Vetor de nomes
        String[] pessoas = {"Luiz", "Cris", "Hadassa", "Esther", "Marques",
                            "Bete", "Magie", "Chico", "Chica", "Max"};

        // Vari�vel para sorteio
        Random random = new Random();
        int indiceGanhador = random.nextInt(pessoas.length);

        // Vari�vel do ganhador
        String ganhador = pessoas[indiceGanhador];
        System.out.println("O ganhador �: " + ganhador);
    }
}
