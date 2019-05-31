package aula23052019;

public class Calculator {
	public static int sum(int... numbers) {
		int total = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			total += numbers[i];
		}
		return total;
	}
	
	public static double sum(double... numbers) {
		int total = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			total += numbers[i];
		}
		return total;
	}
}
