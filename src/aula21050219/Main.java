package aula21050219;

public class Main {
	public static void main(String[] args) {
		
		try {
			Ceara.amanhecer(false);
			Ceara.meioDiar(false);
			Ceara.preChuva(false);
		} catch (SobralException e) {
			System.out.println("Sobral");
		} catch (MaisCalorException e) {
			System.out.println("Mais calor");
		} catch (CalorException e) {
			System.out.println("Calor");
		} finally {
			System.out.println("Executou o finally");
		}
		
	}
}
