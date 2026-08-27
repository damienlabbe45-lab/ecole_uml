package school;

import java.util.ArrayList;
import java.time.LocalDate;

public class Director extends Users {

	public Director(int id, String name, String surname) {
		super(id, name, surname);
	}

	@Override
	public void show_courses(ArrayList<Courses> all_courses) {
		for (Courses courses : all_courses) {
			System.out.println(courses);
		}
	}
	
	public Teacher create_teacher(int id, String Name, String Surname,  Adresse adresse) {
		Teacher teacher = new Teacher(id, Name, Surname, adresse);
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
    	Courses.updateTeacher(cours, nouveauTeacher);
    	Courses.updateLocalDate(cours, nouvelleDateFin, dateType);
    	Courses.updateNameCourse(cours, nouveauNom);
    }

    public void deleteCours(ArrayList<Courses> courses, Courses cours) {
        courses.remove(cours);
    }

}
