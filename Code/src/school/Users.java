package school;

import java.util.ArrayList;

/**
 * Représente un utilisateur de l'école.
 * Cette classe abstraite regroupe les informations communes à tous les
 * utilisateurs, comme les élèves, les enseignants, les directeurs et les
 * administrateurs.
 */
public abstract class Users {
	private int id;
	private String name;
	private String surname;
	
	/**
	 * Construit un utilisateur avec son identifiant et son identité.
	 *
	 * @param id identifiant unique de l'utilisateur
	 * @param name prénom de l'utilisateur
	 * @param surname nom de famille de l'utilisateur
	 */
	public Users(int id, String name, String surname) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
	}
	/**
	 * Retourne l'identifiant de l'utilisateur.
	 *
	 * @return l'identifiant de l'utilisateur
	 */
	public int getId() {
		return id;
	}
	/**
	 * Modifie l'identifiant de l'utilisateur.
	 *
	 * @param id nouvel identifiant de l'utilisateur
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * Retourne le prénom de l'utilisateur.
	 *
	 * @return le prénom de l'utilisateur
	 */
	public String getName() {
		return name;
	}
	/**
	 * Modifie le prénom de l'utilisateur.
	 *
	 * @param name nouveau prénom de l'utilisateur
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Retourne le nom de famille de l'utilisateur.
	 *
	 * @return le nom de famille de l'utilisateur
	 */
	public String getSurname() {
		return surname;
	}
	/**
	 * Modifie le nom de famille de l'utilisateur.
	 *
	 * @param surname nouveau nom de famille de l'utilisateur
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	/**
	 * Affiche les cours accessibles ou associés à cet utilisateur.
	 * L'implémentation dépend du type concret de l'utilisateur.
	 *
	 * @param all_courses liste contenant tous les cours de l'école
	 */
	public abstract void show_courses(ArrayList<Courses> all_courses);
	
	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", surname=" + surname + "]";
	}
	
	

}
