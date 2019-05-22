package aula21050219;

public class Ceara {
	public static void amanhecer(boolean toThrow) throws CalorException {
		if (toThrow) {
			throw new CalorException();
		}
	}
	
	public static void meioDiar(boolean toThrow) throws MaisCalorException {
		if (toThrow) {
			throw new MaisCalorException();
		}
	}

	public static void preChuva(boolean toThrow) throws SobralException {
		if (toThrow) {
			throw new SobralException();
		}
	}

}
