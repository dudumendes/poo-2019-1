package aula14022019;

public class Main {
	public static void main(String[] args) {
		AtracaoTuristica at1 =
				new AtracaoTuristica("Vale da Lua");
		
		Parque p1 = new Parque();
		p1.nome = "Parque dos Veadeiros";
		p1.estado = "Goias";
		p1.anoDeCriacao = "1960";
		p1.atracaoTuristica = at1;
		
		p1.atracaoTuristica =
				new AtracaoTuristica("Veu de Noiva");
		
		Monitor m1 = new Monitor("Apple", "4Op");
		Teclado t1 = new Teclado("Apple", "Bluetooth");
		Mouse mo1 = new Mouse("Apple", "Magic Mouse");
		
		Computador c1 = new Computador("Apple", "iMac");
		c1.monitor = m1;
		c1.teclado = t1;
		c1.mouse = mo1;
		
	}
}
