package aula11042019;

public class Quadrado extends FormaGeometrica {
	private double lado;

	public Quadrado(double lado) {
		this.lado = lado;
	}
	
	public double area() {
		return lado * lado;
	}
}
