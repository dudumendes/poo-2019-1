package aula30052019;

public class Foguete implements Papocavel, Lancavel {
	
	private double aquecimento;
	
	public void setAquecimento(double aquecimento) {
		this.aquecimento = aquecimento;
	}
	
	public double getAquecimento() {
		return this.aquecimento;
	}
	
	public void lancar() throws Exception {
		if (aquecimento > 1000) {
			papocar();
		}
	}
	
	public void papocar() throws Exception {
		System.out.println("Vai papocar");
		throw new Exception();
	}

}









