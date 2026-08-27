package school;

import java.util.HashMap;

<<<<<<< HEAD

=======
>>>>>>> 537bcce77b827d79254ec4b3db1993cd06313cb8
public class Authentification {
	HashMap <String, String> loginPassword = new HashMap<String, String>();
	private String login = "Any";
	private String password = "Any";
	
	/**
	 * Construteur de classe avec le maximum de paramètres
	 * @param loginPassword
	 * @param login
	 * @param password
	 */
	public Authentification(HashMap<String, String> loginPassword, String login, String password) {
		super();
		this.loginPassword = loginPassword;
		this.login = login;
		this.password = password;
	}
	
	/**
	 * Constructeur minimal
	 */
	public Authentification() {
		
	}
	
	/**
	 * Ajouter un login et un mot de passe
	 * @param login
	 * @param password
	 */
	public void addLogin(String login, String password) {
		loginPassword.put(login, password);		
	}
	
	/**
	 * Méthode pour vérifier si le login et le mot de passe sont corrects
	 * @param login
	 * @param password
	 * @return
	 */
	public boolean verifyAuthentification(String login, String password) {
		Boolean testAuthenticationBoolean = false;
	
		if (loginPassword.containsKey(login)) {
			testAuthenticationBoolean = loginPassword.get(login).equals(password); 
		}
		
		return testAuthenticationBoolean;	
	}
	
	public static void main(String[] args) {
<<<<<<< HEAD
		
=======
		Authentification test = new Authentification();
		test.addLogin("toto", "titi");
		String messageString = "Authentification a échouée\nMauvais identifiant ou mauvais mot de passe !";
		if (test.verifyAuthentification("toto", "titi")) {
			messageString = "Authentification réussie !";
		}
		System.out.println(messageString);	
>>>>>>> 537bcce77b827d79254ec4b3db1993cd06313cb8
	}	

}
