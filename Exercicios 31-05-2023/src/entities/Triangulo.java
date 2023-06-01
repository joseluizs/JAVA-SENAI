package entities;

public class Triangulo {
	
	public double lado1;
    public double lado2;
    public double lado3;
    
    public Triangulo(double lado1, double lado2, double lado3) {

    }

    public String verificarTipoTriangulo() {
        if (lado1 == lado2 && lado2 == lado3) {
            return "Triângulo Equilátero";
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            return "Triângulo Isósceles";
        } else {
            return "Triângulo Escaleno";
        }
    }

}
