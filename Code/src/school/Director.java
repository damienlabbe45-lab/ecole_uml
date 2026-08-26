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
	
	public void deleteTeacher(ArrayList<Teacher> teachers, Teacher teacher) {
        teachers.remove(teacher);
    }

    public Student createStudent(int id, String name, String surname, Addresse address) {
        return new Student(id, name, surname, address);
    }

    public void deleteStudent(ArrayList<Student> students, Student student) {
        students.remove(student);
    }

    public Courses createCours(String nomCours, Date dateDebut, Date dateFin, Teacher teacher) {
        return new Courses(nomCours, dateDebut, dateFin, teacher);
    }

    public void modifyCours(Courses cours, String nouveauNom, Date nouvelleDateDebut,
                            Date nouvelleDateFin, Teacher nouveauTeacher) {
    // a completer
    }

    public void deleteCours(ArrayList<Courses> courses, Courses cours) {
        courses.remove(cours);
    }
	
	public Student create_student(Users users, Adresse adresse) {
		
	}

}
