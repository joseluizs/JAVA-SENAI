package principal;

public class Program {

	public static void main(String[] args) {
		mensagem();
		mensagem2(20.54);
		System.out.println(mensagem3());
		System.out.println(mensagem4(256));
		System.out.println("Exmplo do Igor: " + exemploDoIgor(16.6));
		System.out.println(soma
				(10 + 5, 0));
		

	}
	
	static void mensagem() {
		System.out.println("Primeiro void");
	}
	
	static void mensagem2(double n) {
		System.out.println("O número informado foi: " + n);
	}
	
	static String mensagem3() {
		return "Aqui é minha função de número 3";
	}
	
	static String mensagem4(int x) {
		return "Número informado: " + x;
	}

	static int exemploDoIgor(double y) {
		//conversão explicita/ cast
		return (int) y;
		
	}
	
	static int soma (int a, int b) {
		return a + b;
	}
}
