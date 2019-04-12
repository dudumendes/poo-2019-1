package aula11042019;

public class Triangulo extends FormaGeometrica {
	
	private double base, altura;
	
	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public double area() {	
		return (base*altura)/2;
	}
}
