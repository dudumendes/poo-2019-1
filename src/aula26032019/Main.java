package aula26032019;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Computador comp = new Computador();
		
		String monitorString = JOptionPane.showInputDialog("Informe modelo do monitor");
		Monitor monitor = new Monitor(monitorString);

		String mouseString = JOptionPane.showInputDialog("Informe modelo do mouse");
		Periferico mouse = new Mouse(mouseString);
		
		String tecladoString = JOptionPane.showInputDialog("Informe modelo do teclado");
		Teclado teclado = new Teclado(tecladoString);
		
		comp.addPeriferico(monitor);
		comp.addPeriferico(mouse);
		comp.addPeriferico(teclado);
		
		comp.ligar();
		comp.desligar();
		System.exit(0);
	}
}
