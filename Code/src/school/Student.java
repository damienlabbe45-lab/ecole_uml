package school;

import java.util.ArrayList;

public class Student extends Users {
	
	private Adresse adresse;

	public Student(int id, String name, String surname, Adresse adresse) {
		super(id, name, surname);
		this.adresse = adresse;
	}

	@Override
	public void show_courses(ArrayList<Courses> all_courses) {
		for (Courses courses : all_courses) {
			for (Student student : courses.getStudents()) {
				if (student == this) {
					System.out.println(courses);
					break;
				}
			}
		}
		
	}

}
