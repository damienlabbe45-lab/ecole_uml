package school;

import java.util.HashMap;

public class Adresse {
  	/**
	 * Hypothèse la ville de l'école est Toulouse
	 */
	private HashMap<String, Integer> distances = new HashMap<String, Integer>();
	private String street = "unknown";
	private String city;
	private int codePostal = 0;

  	/**
	 * Constructeur de la classe avec l'ensemble des paramètres définis
	 * @param street
	 * @param city
	 * @param codePostal Entier 
	 */
	public Adresse(String street, String city, int codePostal) {
		distances.put("toulouse", 0);
		this.street = street;
		this.city = city;
		this.codePostal = codePostal;
	}

}
