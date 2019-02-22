package aula21022019;

public class Poder {
	String onomatopeia;
	
	public Poder(String onomatopeia) {
		this.onomatopeia = onomatopeia;
	}
	
	public Poder() {}
	
	public String toString() {
		return onomatopeia;
	}
	
	public void ativar() {
		System.out.println("Ativando... " + onomatopeia);
	}
}
