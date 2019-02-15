package aula14022019;

public class AtracaoTuristica {
	String nome;
	String descricao;
	
	public AtracaoTuristica(String nome) {
		this.nome = nome;
	}
	
	public void exibir() {
		System.out.println("- " + nome);
		System.out.println("\n");
	}
}
