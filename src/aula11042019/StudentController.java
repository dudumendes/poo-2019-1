package aula11042019;

import java.util.List;

public class StudentController {
	private StudentService service = new StudentServiceImpl();
	
	public List<Student> list() {
		return service.getAll();
	}
}
