package aula04042019.graphics;

public class Triangle extends Graphic {
	protected int base, height;
	
	protected void calculatePosition() {
	 System.out.println(
			 "Caculating area: " + (base * height)/2);	
	}
	
	public void setup() {
		System.out.println("Setting up ... " );
		base = 10;
		height = 30;
	}
	
	public void tearDown() {
		System.out.println("Exiting...");
	}
}
