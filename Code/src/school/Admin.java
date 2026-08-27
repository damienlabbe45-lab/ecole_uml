package school;

import java.util.ArrayList;

public class Admin extends Users {

	public Admin(int id, String name, String surname) {
		super(id, name, surname);
	}

	@Override
	public void show_courses(ArrayList<Courses> all_courses) {
		for (Courses courses : all_courses) {
			System.out.println(courses);
		}
	}
	
	public Director create_director(Users user) {
		return new Director(user.getId(), user.getName(), user.getSurname());
	}
	
}
