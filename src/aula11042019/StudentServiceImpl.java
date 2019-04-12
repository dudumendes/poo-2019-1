package aula11042019;

import java.util.List;

public class StudentServiceImpl 
				implements StudentService {

	private StudentRepository repository = new StudentRepositoryImpl();
	
	public List<Student> getAll() {
		return repository.findAll();
	}
}
