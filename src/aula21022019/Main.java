package aula21022019;

import aula26022019.RaioCongelante;

public class Main {
	public static void main(String[] args) {
		Heroi h1 = new Heroi("Superman", "Clark Kent");
		h1.adicionarPoder(new Poder());
		h1.adicionarPoder(new Hadouken("Hadouuuuuuken"));
		h1.adicionarPoder(new RaioCongelante("frssssssssssss"));
		
		h1.usarPoder(1);
	}
}








