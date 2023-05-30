package principal;

import java.util.Scanner;

public class NumerosPares {
    
    public static void main(String[] args) {
        int tamanhoVetor = 50;
        int[] numeros = new int[tamanhoVetor];

        // Ler n�meros do usu�rio
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 50 n�meros:");

        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.print("N�mero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("Valores pares e suas posi��es:");

        // Iterando vetor p/ encontrar e exibir os valores pares
        for (int i = 0; i < tamanhoVetor; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println("Valor par: " + numeros[i] + ", posi��o: " + i);
            }
        }
        sc.close();
    }
}

