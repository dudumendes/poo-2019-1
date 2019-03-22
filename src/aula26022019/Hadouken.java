package aula26022019;

public class Hadouken extends Poder {
	
	public Hadouken(String onomatopeia) {
		this.onomatopeia = onomatopeia;
	}
	
	public void ativar() {
		System.out.println("********... " + onomatopeia);
	}
}
