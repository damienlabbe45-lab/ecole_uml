package school;

import java.util.ArrayList;

public class Teacher extends Users {
	
	private Adresse adresse;

	public Teacher(int id, String name, String surname, Adresse adresse) {
		super(id, name, surname);
		this.adresse = adresse;
	}

	@Override
	public void show_courses(ArrayList<Courses> all_courses) {
		// TODO Auto-generated method stub
		
	}

}
