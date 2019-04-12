package aula11042019;

public class Retangulo extends FormaGeometrica {
	
	private double base;
	private double altura;
	
	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public double area() {
		return base * altura;
	}
}
