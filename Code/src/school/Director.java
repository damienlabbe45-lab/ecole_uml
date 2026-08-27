package school;

import java.util.ArrayList;
import java.time.LocalDate;

/**
* Représente le directeur de l'école
* 
* @version 1.0
*/

public class Director extends Users {

    /**
    * Crée un nouveau directeur
    *
    * @param id     l'identifiant du directeur
    * @param name le prénom du directeur
    * @param surname      le nom du directeur
    */
	public Director(int id, String name, String surname) {
		super(id, name, surname);
	}

    /**
    * affiche la liste des courses
    *
    * @param all_courses     la liste de tout les cours
    */
	@Override
	public void show_courses(ArrayList<Courses> all_courses) {
		for (Courses courses : all_courses) {
			System.out.println(courses);
		}
	}
	
    /**
    * Crée un nouveau enseignant
    *
    * @param id     l'identifiant de l'enseignant
    * @param name le prénom de l'enseignant
    * @param surname      le nom de l'enseignant
    * @param adresse l'adresse de l'enseignant
    * @return Teacher retourne l'enseignant
    */
	public Teacher create_teacher(int id, String Name, String Surname,  Adresse adresse) {
		return new Teacher(id, Name, Surname, adresse);
	}
	
    /**
     * supprimme un enseignant
     * 
     * @param teachers la liste des enseignants
     * @param teacher  un enseignant qui sera supprimmé
     */
	public void deleteTeacher(ArrayList<Teacher> teachers, Teacher teacher) {
        teachers.remove(teacher);
    }

    /**
    * Crée un nouveau élève
    *
    * @param id     l'identifiant de l'élève
    * @param name le prénom de l'élève
    * @param surname      le nom de l'élève
    * @param adresse l'adresse de l'élève
    * @return Student retourne l'enseignant
    */
    public Student createStudent(int id, String name, String surname, Adresse address) {
        return new Student(id, name, surname, address);
    }

    /**
     * supprimme un élève
     * 
     * @param teachers la liste des élèves
     * @param teacher  un eélève qui sera supprimmé
     */
    public void deleteStudent(ArrayList<Student> students, Student student) {
        students.remove(student);
    }

    /**
    * Crée un nouveau cours et l'ajoute automatiquement au registre global.
    *
    * @param nomCours     le nom du cours 
    * @param dateDebut      la date de début 
    * @param dateFin        la date de fin 
    * @param teacher l'enseignant responsable du cours
    * @return Courses le cours créé
    */
    public Courses createCours(String nomCours, LocalDate dateDebut, LocalDate dateFin, Teacher teacher) {
        return new Courses(nomCours, teacher, dateDebut, dateFin);
    }

    /**
    * Crée un nouveau cours et l'ajoute automatiquement au registre global.
    *
    * @param cours le cours à modifier
    * @param nouveauNom     le nouveau nom du cours 
    * @param nouvelleDateDebut      la  nouvelle date de début 
    * @param nouvelleDateFin        la nouvelle date de fin 
    * @param nouveauTeacher le nouveau enseignant responsable du cours
    */
    public void modifyCours(Courses cours, String nouveauNom, LocalDate nouvelleDateDebut,
                            LocalDate nouvelleDateFin, Teacher nouveauTeacher, String dateType) {
    	Courses.updateTeacher(cours, nouveauTeacher);
    	Courses.updateLocalDate(cours, nouvelleDateFin, dateType);
    	Courses.updateNameCourse(cours, nouveauNom);
    }
    
    /**
     * supprimme un élève
     * 
     * @param teachers la liste des élèves
     * @param teacher  un eélève qui sera supprimmé
     */
    public void deleteCours(ArrayList<Courses> courses, Courses cours) {
        courses.remove(cours);
    }

}
