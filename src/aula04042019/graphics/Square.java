package aula04042019.graphics;

public class Square extends Graphic {
	protected int side;
	
	public Square(int x, int y, int side) {
		this.x = x;
		this.y = y;
		this.side = side;
	}
	
	protected void calculatePosition() {
		System.out.println(
				"Calculating Position: x: "
					+ x + ", y: " + y + ", side: " + side);
	}
	
}
