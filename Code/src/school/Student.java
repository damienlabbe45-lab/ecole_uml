package school;

import java.util.ArrayList;

/**
 * Représente un élève de l'école.
 * Un élève possède une adresse et peut consulter les cours auxquels il est
 * inscrit.
 */
public class Student extends Users {
	
	private Adresse adresse;

	/**
	 * Construit un élève.
	 *
	 * @param id identifiant unique de l'élève
	 * @param name prénom de l'élève
	 * @param surname nom de famille de l'élève
	 * @param adresse adresse de l'élève
	 */
	public Student(int id, String name, String surname, Adresse adresse) {
		super(id, name, surname);
		this.adresse = adresse;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	/**
	 * Affiche les cours auxquels cet élève est inscrit.
	 * La méthode parcourt tous les cours, puis recherche l'élève dans la liste
	 * des inscrits de chaque cours.
	 *
	 * @param all_courses liste contenant tous les cours de l'école
	 */
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
