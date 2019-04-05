package aula04042019.graphics;

public abstract class Graphic {
	protected int x, y;

	protected abstract void calculatePosition();
	
	protected void setup() {}
	protected void tearDown() {}
	
	protected void applyFilters() {
		System.out.println("Applying filters...");
	}
	
	public final void draw() {
		setup();
		calculatePosition();
		applyFilters();
		tearDown();
	}
}
