package aula26032019;

import java.util.ArrayList;
import java.util.List;

public class Computador extends Eletronico {
	
	private List<Periferico> perifericos = new ArrayList<Periferico>();
	
	public void ligar() {
		System.out.println("Ligando...");
	}
	
	public void desligar() {
		System.out.println("Desligando...");
	}
	
	public void addPeriferico(Periferico periferico) {
		perifericos.add(periferico);
		
		System.out.println("Adicionado " + periferico.modelo);
	}
}
