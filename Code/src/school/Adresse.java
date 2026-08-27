package school;

import java.util.HashMap;
import java.util.random.RandomGenerator.LeapableGenerator;

import org.w3c.dom.css.ElementCSSInlineStyle;

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
		init();
		this.street = street;
		this.city = city;
		this.codePostal = codePostal;
	}

	/**
	 * Constructeur minimal de la classe avec le seul paramètre obligatoire
	 * @param city
	 */
	public Adresse(String city) {
		distances.put("toulouse", 0);
		init();
		this.city = city;
	}

	public Adresse(String city, int codePostal) {
		distances.put("toulouse", 0);
		init();
		this.city = city;
		this.codePostal = codePostal;
	}
	
	public Adresse(String street, String city) {
		distances.put("toulouse", 0);
		init();
		this.street = street;
		this.city = city;
	}

	/**
	 * Cette fonction d'apporter les informations de distances
	 * 
	 * Hypothèse prise l'école est a Toulouse
	 *
	 * Les distances entre toulouse et la ville en question
	 * tableau associatif clef: String, valeur: Int
	 * clef, la ville de l'élève
	 * distance, un int
	 */
	private void init () {
	    distances.put("blagnac", 7);
	    distances.put("balma", 7);
	    distances.put("colomiers", 12);
	    distances.put("ramonville-saint-agne", 12);
	    distances.put("tournefeuille", 13);
	    distances.put("union", 12);
	    distances.put("aucamville", 12);
	    distances.put("saint-orens-de-gameville", 15);
	    distances.put("cugnaux", 16);
	    distances.put("fonsorbes", 25);
	    distances.put("leguevin", 25);
	    distances.put("grenade", 30);
	    distances.put("fronton", 30);
	    distances.put("muret", 25);
	    distances.put("auterive", 35);
	    distances.put("villefranche-de-lauragais", 35);
	    distances.put("carbonne", 45);
	    distances.put("revel", 50);

	    // Villes situées autour de Toulouse
	    distances.put("montauban", 55);
	    distances.put("albi", 75);
	    distances.put("castres", 80);
	    distances.put("carcassonne", 95);
	    distances.put("auch", 80);
	    distances.put("tarbes", 155);
	    distances.put("foix", 90);
	    distances.put("saint-gaudens", 95);
	    distances.put("cahors", 115);
	    distances.put("pamiers", 75);
	}

	/**
	 * Méthode de calcul des distances entre le domicile de l'élève et
	 * l'école supposée à toulouse
	 * @return la distance sous forme d'entier
	 */
	public int calculateSchoolDistance() {		
		
		return distances.get(city.toLowerCase());
	}
	
	/**
	 * Méthode pour afficher les informations de l'adresse
	 * et l'éloignement du domicile de l'élève de l'école
	 * @return le message à afficher
	 */
	public String adressDisplayInformations() {
		String messageString = "";
		if (!street.equalsIgnoreCase("unknown")){
			messageString += street + ", ";			
		}
		
		if (codePostal > 0){
			messageString += String.valueOf(codePostal) + " ";			
		}
		
		messageString += city;		
		messageString += " est à " + String.valueOf(calculateSchoolDistance()) + "Km de l'école";

		return messageString;
	}

	@Override
	public String toString() {
		return adressDisplayInformations();
	}
}
