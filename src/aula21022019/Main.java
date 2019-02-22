package aula21022019;

public class Main {
	public static void main(String[] args) {
		Heroi h1 = new Heroi("Superman", "Clark Kent");
		h1.adicionarPoder(new Poder());
		h1.adicionarPoder(new Hadouken("Hadouuuuuuken"));
		
		h1.usarPoder(1);
	}
}








