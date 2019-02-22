package aula21022019;
import java.util.List;
import java.util.ArrayList;

public class Heroi {
	String nome;
	String identidadeSecreta;
	List<Poder> poderes = new ArrayList<Poder>();
	
	public void adicionarPoder(Poder poder) {
		poderes.add(poder);
	}
		
	public void usarPoder(int index) {
		if (index >= 0 && index < poderes.size()) {
			poderes.get(index).ativar();
		}
	}
	
	public Heroi(String nome, String identidadeSecreta) {
		this.nome = nome;
		this.identidadeSecreta = identidadeSecreta;
	}
	
	public Heroi() {}
	
	public String toString() {
		return this.nome + " : " + this.identidadeSecreta;
	}
}
