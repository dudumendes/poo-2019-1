package vp1.solucao;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		String resposta = "";
		
		Emprestimo emprestimo = new Emprestimo();
		
		resposta = JOptionPane.showInputDialog("Informe o nome do credor");
		emprestimo.setCredor(resposta);

		
		resposta = JOptionPane.showInputDialog("Informe a quantidade de parcelas");
		emprestimo.qtdParcelas = Integer.parseInt(resposta);
		
		resposta = JOptionPane.showInputDialog("Informe o valor do emprestimo");
		emprestimo.valor = Double.parseDouble(resposta);

		String mensagem = "Caro(a) " + emprestimo.getCredor()
							+ ", para o emprestimo no valor de " + emprestimo.valor
							+ ", voce pagara " + emprestimo.qtdParcelas
							+ " parcelas, de " + emprestimo.calcularValorDaParcela();
		
		JOptionPane.showMessageDialog(null, mensagem);
							
		System.exit(0);
	}
}
