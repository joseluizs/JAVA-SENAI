package principal;

public class Program {
	
	public static void main(String[] args) {
        // Mostrar abaixo do outro
        for (int i = 1; i <= 25; i++) {
        	if (i % 2 != 0) {
        		System.out.println(" impares: " + i);
        	}
        }

        // Mostraar ao lado do outro
        System.out.println("\nNúmeros ímpares um ao lado do outro:");
        for (int i = 1; i <= 25; i += 2) {
            System.out.print(i + " ");
        }
        
        
        
		

        
        
        
        
    }

}
