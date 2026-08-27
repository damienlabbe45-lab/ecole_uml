package school;

import java.util.ArrayList;

public class Teacher extends Users {
	
	private Adresse adresse;

	public Teacher(int id, String name, String surname, Adresse adresse) {
		super(id, name, surname);
		this.adresse = adresse;
	}

	public void showOneStudent(Student student) {
        System.out.println(student);
    }

    public void showGroupStudents(ArrayList<Student> students) {
        for (Student student : students) {
            showOneStudent(student);
        }
    }
    
	@Override
	public void show_courses(ArrayList<Courses> all_courses) {
		for (Courses courses : all_courses) {
			if (courses.getTeacherCourses() == this) {
                System.out.println(courses);
            }
		}	
	}

}
