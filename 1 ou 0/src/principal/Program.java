package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int contadorSim = 0;
        int resposta;

        do {
            System.out.println("Digite 1 'sim' ou 0 'n�o':");
            resposta = sc.nextInt();

            if (resposta == 1) {
                contadorSim++;
                System.out.println("Resposta: SIM");
            }

        } while (resposta == 1);

        System.out.println("O n�mero de 'sim' �: " + contadorSim);
        
        
        
        
        //Fa�a o mesmo programa do exerc�cio 1 mas usando while;
        
        contadorSim = 0;
        int i = 1;

        System.out.println("Digite 1 sim ou 0 n�o:");

        while (i <= 5) {
            int resposta1 = sc.nextInt();

            if (resposta1 == 1) {
                contadorSim++;
            }

            i++;
        }
        
        System.out.println("O n�mero de 'sim' �: " + contadorSim);

        sc.close();
	}

}
