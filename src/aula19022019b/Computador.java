package aula19022019b;
import java.util.List;
import java.util.ArrayList;

public class Computador extends Eletronico {
	
	List<Periferico> perifericos = new ArrayList<Periferico>();
	
	public Computador(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}
}
