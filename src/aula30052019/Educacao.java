package aula30052019;

public class Educacao {

	public void estudar() throws PapocoException {
		if (true) {
			throw new PapocoException();
		}
	}
	
	public void pesquisar() throws PapocoException {
		estudar();
	}
}
