package aula19022019b;

public class Main {
	public static void main(String[] args) {
		Computador c1 = 
				new Computador("Apple", "MacBook Pro");
		
		c1.perifericos.add(new Teclado("Apple", "AppleKey"));
		c1.perifericos.add(new Mouse("Apple", "Magic Mouse"));
		c1.perifericos.add(new Monitor("AOC", "Curve"));
	}
}
