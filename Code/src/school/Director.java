package school;

import java.util.ArrayList;

public class Director extends Users {

	public Director(int id, String name, String surname) {
		super(id, name, surname);
	}

	@Override
	public void show_courses(ArrayList all_courses) {
		
	}
	
	public Teacher create_teacher(Users user, Adresse adresse) {
		Teacher teacher = new Teacher(user.getId(), user.getName(), user.getSurname(), adresse);
		return teacher;
	}
	
	public void del_teacher(ArrayList<Teacher> all_teacher) {
		
	}
	
	public Student create_student(Users users, Adresse adresse) {
		
	}

}
