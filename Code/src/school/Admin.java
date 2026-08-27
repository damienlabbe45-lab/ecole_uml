package school;

import java.util.ArrayList;

/**
* Représente l'admin de l'application et de la base de donnée
* 
* @version 1.0
*/
public class Admin extends Users {

    /**
    * Crée un nouveau admin
    *
    * @param id     l'identifiant de l'admin
    * @param teacherCourses le prénom de l'admin
    * @param dateBegin      le nom de l'admin
    */
	public Admin(int id, String name, String surname) {
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
    * Crée un nouveau admin
    *
    * @param id     l'identifiant du directeur
    * @param teacherCourses le prénom du directeur
    * @param dateBegin      le nom du directeur
	* @return Director (retourne le directeur)
    */
	public Director create_director(Users user) {
		return new Director(user.getId(), user.getName(), user.getSurname());
	}
	
}
