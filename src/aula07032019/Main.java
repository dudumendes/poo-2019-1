package aula07032019;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Pessoa p = new Pessoa("Julio", 19);
		System.out.println(p.getNome());
		System.out.println(p.getIdade());
		
		String nome = JOptionPane.showInputDialog("Digite seu nome:");
		
		p.setNome(nome);
		
		JOptionPane.showMessageDialog(null, "Oi, " + p.getNome());
		
		 
		
		System.exit(0);
		
	}
}
