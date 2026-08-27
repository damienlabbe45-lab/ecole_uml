package school;

public class test {
	public static void main(String[] args) {
		// Test de la classe Admin
        Admin admin = new Admin(2, "Alice", "Dupont");
        verifier("Admin hérite de User", admin instanceof Users);
	}
	
	private static void verifier(String nomDuTest, boolean condition) {
        if (condition) {
            System.out.println("[OK] " + nomDuTest);
        } else {
            System.out.println("[ÉCHEC] " + nomDuTest);
        }
    }
}
