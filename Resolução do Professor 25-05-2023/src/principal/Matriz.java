package principal;

public class Matriz {

	public static void main(String[] args) {

		int[][] numeros = new int[3][3];

		int count = 1;

		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros.length; j++) {
				numeros[i][j] = count;
				System.out.print(numeros[i][j] + "\t");
				count++;
			}
			System.out.println();
		}
	}

}
