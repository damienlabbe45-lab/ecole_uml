package school;

import java.util.ArrayList;

/**
 * Représente un enseignant de l'école.
 * Un enseignant possède une adresse, peut consulter ses cours et afficher
 * les informations d'un ou de plusieurs élèves.
 */
public class Teacher extends Users {
	
	private Adresse adresse;

	/**
	 * Construit un enseignant.
	 *
	 * @param id identifiant unique de l'enseignant
	 * @param name prénom de l'enseignant
	 * @param surname nom de famille de l'enseignant
	 * @param adresse adresse de l'enseignant
	 */
	public Teacher(int id, String name, String surname, Adresse adresse) {
		super(id, name, surname);
		this.adresse = adresse;
	}

	/**
	 * Affiche les informations d'un élève.
	 *
	 * @param student élève à afficher
	 */
	public void showOneStudent(Student student) {
        System.out.println(student);
    }

	/**
     * Affiche les informations de tous les élèves d'un groupe.
     *
     * @param students liste des élèves à afficher
     */
    public void showGroupStudents(ArrayList<Student> students) {
        for (Student student : students) {
            showOneStudent(student);
        }
    }
    
    /**
	 * Affiche uniquement les cours attribués à cet enseignant.
	 *
	 * @param all_courses liste contenant tous les cours de l'école
	 */
	@Override
	public void show_courses(ArrayList<Courses> all_courses) {
		for (Courses courses : all_courses) {
			if (courses.getTeacherCourses() == this) {
                System.out.println(courses);
            }
		}	
	}

}
