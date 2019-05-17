package aula16052019;

public class BotandoBoneco {
	public static void main(String[] args) {
		Bonequeiro dudu = new Bonequeiro(10);
		
		try {
			dudu.botarBoneco();
		} catch (RessacaException e) {
			dudu.tomarEngov();
		}
	}

}
