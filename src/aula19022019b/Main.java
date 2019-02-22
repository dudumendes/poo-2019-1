package aula19022019b;

public class Main {
	public static void main(String[] args) {
		Computador c1 = 
				new Computador("Apple", "MacBook Pro");
		
		c1.perifericos.add(new Teclado("Apple", "AppleKey"));
		c1.perifericos.add(new Mouse("Apple", "Magic Mouse"));
		c1.perifericos.add(new Monitor("AOC", "Curve"));
		
		for (int i = 0; i < c1.perifericos.size(); i++) {
			System.out.println(c1.perifericos.get(i));
		}
		
		//Declaro uma variavel do tipo dos elementos
		//da minha lista e informo qual a lista
		for (Periferico pf : c1.perifericos) {
			System.out.println(pf);
		}
		
		c1.perifericos.forEach(p1 -> System.out.println(p1));
	}
}
