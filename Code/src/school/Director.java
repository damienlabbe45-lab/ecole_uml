package school;

import java.util.ArrayList;
import java.time.LocalDate;

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

    public Student createStudent(int id, String name, String surname, Adresse address) {
        return new Student(id, name, surname, address);
    }

    public void deleteStudent(ArrayList<Student> students, Student student) {
        students.remove(student);
    }

    public Courses createCours(String nomCours, LocalDate dateDebut, LocalDate dateFin, Teacher teacher) {
        return new Courses(nomCours, teacher, dateDebut, dateFin);
    }

    public void modifyCours(Courses cours, String nouveauNom, LocalDate nouvelleDateDebut,
                            LocalDate nouvelleDateFin, Teacher nouveauTeacher, String dateType) {
    	cours.updateTeacher(cours, nouveauTeacher);
    	cours.updateLocaldate(cours, nouvelleDateFin, dateType);
    	cours.updateNameCourses(cours, nouveauNom);
    }

    public void deleteCours(ArrayList<Courses> courses, Courses cours) {
        courses.remove(cours);
    }

}
