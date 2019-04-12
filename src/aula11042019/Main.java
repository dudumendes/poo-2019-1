package aula11042019;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<FormaGeometrica> formas = new ArrayList<>();
		
		Quadrado q = new Quadrado(10.0);
		
		formas.add(q);
		
		Triangulo t = new Triangulo(50.0, 23.0); 
 		formas.add(t);
		
		Circulo c = new Circulo(30.0);
		
		formas.add(c);
		
		Retangulo r = new Retangulo(13.0, 23.0);
		
		formas.add(r);
		
		
		System.out.println(q.area());
		System.out.println(t.area());
		System.out.println(c.area());
		System.out.println(r.area());
		
		for (FormaGeometrica fg : formas) {
			System.out.println(fg.area());
		}
		
		
	}
}
