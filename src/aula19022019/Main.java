package aula19022019;

public class Main {
	public static void main(String[] args) {
		Computador c1 = 
				new Computador("Apple", "MacBook Pro");
		
		c1.periferico = new Teclado("Apple", "AppleKey");
		c1.periferico = new Mouse("Apple", "Magic Mouse");
		c1.periferico = new Monitor("AOC", "Curve");
	}
}
