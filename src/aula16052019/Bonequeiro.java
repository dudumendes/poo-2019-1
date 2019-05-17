package aula16052019;

public class Bonequeiro implements Embriagavel {
	private boolean ressaca = false;
	private double taxaDeAlcoolNoSangue;
	private double limiteBebum;
	private static final int PARAR_DE_BEBER = 7;
	
	public Bonequeiro(double limiteBebum) {
		this.limiteBebum = limiteBebum;
	}
	
	public void tomarUma(Bebida b) throws EncheuACaraException {
		System.out.println("Tomando so mais essa...");
		if (taxaDeAlcoolNoSangue > limiteBebum) {
			throw new EncheuACaraException();
		}
		taxaDeAlcoolNoSangue += b.taxaDeAlcoolPorDose;
	}
	
	public int getConsciencia() {
		return (int) Math.random() * 10;
	}
	
	public void naoDirigir() {
		System.out.println("Se beber, nao dirija");
	}
	
	public static void chamarOHugo() {
		System.out.println("uhgggggg");
	}
	
	public void tomarEngov() {
		System.out.println("Tomando Engov");
	}
	
	public void botarBoneco() throws RessacaException {
		while (getConsciencia() != PARAR_DE_BEBER) {
			try {
				tomarUma(new Bebida(1));
			} catch(EncheuACaraException e) {
				ressaca = true;
				throw new RessacaException();
			} finally {
				naoDirigir();
			}
		}
	}
	
	public boolean isRessaca() {
		return ressaca;
	}
	public void setRessaca(boolean ressaca) {
		this.ressaca = ressaca;
	}
	public double getTaxaDeAlcoolNoSangue() {
		return taxaDeAlcoolNoSangue;
	}
	public void setTaxaDeAlcoolNoSangue(double taxaDeAlcoolNoSangue) {
		this.taxaDeAlcoolNoSangue = taxaDeAlcoolNoSangue;
	}
	public double getLimiteBebum() {
		return limiteBebum;
	}
	public void setLimiteBebum(double limiteBebum) {
		this.limiteBebum = limiteBebum;
	}
	
	
}
