package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int contadorSim = 0;
        int resposta;

        do {
            System.out.println("Digite 1 'sim' ou 0 'não':");
            resposta = sc.nextInt();

            if (resposta == 1) {
                contadorSim++;
                System.out.println("Resposta: SIM");
            }

        } while (resposta == 1);

        System.out.println("O número de 'sim' é: " + contadorSim);
        
        
        
        
        //Faça o mesmo programa do exercício 1 mas usando while;
        
        contadorSim = 0;
        int i = 1;

        System.out.println("Digite 1 sim ou 0 não:");

        while (i <= 5) {
            int resposta1 = sc.nextInt();

            if (resposta1 == 1) {
                contadorSim++;
            }

            i++;
        }
        
        System.out.println("O número de 'sim' é: " + contadorSim);

        sc.close();
	}

}
