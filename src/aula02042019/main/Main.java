package aula02042019.main;

import aula02042019.robots.*;

public class Main {
	public static void main(String[] args) {
		Robot carRobot = new CarRobot();
		Robot pianoRobot = new PianoRobot();
		
		carRobot.execute();
		pianoRobot.execute();
	}
}
