package preaula19022019;

public class Inscricao {
	static int numero = 0;
	Candidato candidato;
	Concurso concurso;
	
	public Inscricao(Candidato candidato, Concurso concurso) {
		this.candidato = candidato;
		this.concurso = concurso;
		this.numero += this.numero;
	}
}
