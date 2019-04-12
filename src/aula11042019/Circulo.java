package aula11042019;

public class Circulo extends FormaGeometrica {
	
	private double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}
	
	public double area() {
		return Math.PI * raio * raio;
	}
}
