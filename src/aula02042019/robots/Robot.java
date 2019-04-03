package aula02042019.robots;

public abstract class Robot {
	protected abstract void doWork();
	
	protected void initialize() {
		System.out.println("Initializing...");
	}
	
	protected void finalize() {
		System.out.println("Finalizing...");
	}
	
	public void execute() {
		initialize();
		doWork();
		finalize();
	}
}
