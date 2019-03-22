package vp1.solucao;

public class Emprestimo {
	private String credor;
	public double valor;
	public int qtdParcelas;
	
	public void setCredor(String credor) {
		this.credor = credor;
	}
	
	public String getCredor() {
		return credor;
	}
	
	public double getTaxaDeJuros() {
		if (this.qtdParcelas < 5) {
			return 0.02;
		} else if (this.qtdParcelas < 12) {
			return 0.045;
		} else {
			return 0.08;
		}
	}
	
	public double getJuros() {
		return this.valor * getTaxaDeJuros() * this.qtdParcelas;
	}
	
	public double calcularValorDaParcela() {
		return (valor + getJuros())/this.qtdParcelas;
	}
}
