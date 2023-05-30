package principal;

public class Program {

	public static void main(String[] args) {
		int soma = 0;
		for (int i = 1; i <= 25; i++) {
            if (i % 2 != 0) {
            	soma += i;
            System.out.println(" impares: " + i);
            }
        }
		System.out.println("A soma dos números é: " + soma );

	}

}
