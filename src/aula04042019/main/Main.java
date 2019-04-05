package aula04042019.main;
import aula04042019.graphics.*;

public class Main {
	/**
	 * Testing template-method
	 * @param args
	 */
	public static void main(String[] args) {
		Graphic square = new Square(0, 0, 100);
		Graphic triangle = new Triangle();
		
		//square.draw();
		triangle.draw();
	}
}
