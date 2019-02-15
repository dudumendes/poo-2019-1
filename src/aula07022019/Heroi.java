package aula07022019;

public class Heroi {
	String nome;
	String identidadeSecreta;
	Poder poder = new Poder("shshshhshshshsh");
	
	public void usarPoder() {
		poder.ativar();
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
