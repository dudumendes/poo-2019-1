package aula11042019;

import java.util.ArrayList;
import java.util.List;

public class StudentRepositoryImpl implements StudentRepository {
	
	public List<Student> findAll() {	
		System.out.println("findAll");
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student("Filipe"));
		students.add(new Student("Israel"));
		students.add(new Student("Nino"));
		
		
		return students;
	}
}
