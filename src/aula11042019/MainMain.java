package aula11042019;

import java.util.List;

public class MainMain {
	public static void main(String[] args) {
		StudentController controller = new StudentController();
		
		List<Student> students = controller.list();
		
		System.out.println(students);
	}
}
