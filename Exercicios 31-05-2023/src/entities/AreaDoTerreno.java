package entities;

public class AreaDoTerreno {
	
	private double area;

    public void calcularArea(double largura, double comprimento) {
        this.area = largura * comprimento;
    }

    public double getArea() {
        return area;
    }

}
