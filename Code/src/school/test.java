package school;

import java.time.LocalDate;
import java.util.ArrayList;

public class test {
	public static void main(String[] args) {
		// Test de la classe Admin
        Admin admin = new Admin(2, "Alice", "Dupont");
        verifier("Admin hérite de User", admin instanceof Users);
        Director directeur = new Director(1, "Robert", "Dupont");        
        Teacher jdoeTeacher = directeur.create_teacher(0, "John", "Doe", new Adresse("Auch"));
        System.out.println("Affichage d'un professeur"); 
        Courses cours = directeur.createCours("Algorithmique", LocalDate.of(2026, 6, 22), LocalDate.of(2026, 8, 12), jdoeTeacher);
        Student student = new Student (2, "Anaïs", "Binet", new Adresse("Toulous"));
        cours.addStudent(student);
        
        ArrayList<Courses>listeCours = new ArrayList<Courses>();
        
        listeCours.add(cours);
        directeur.show_courses(listeCours);
        student.show_courses(listeCours);
        System.out.println(jdoeTeacher);
        Adresse testAdresse1 = new Adresse("Toulouse");
        System.out.println(testAdresse1.toString());        
	}
	
	/**
	 * Test si une instance hérite d'une classe mère
	 * @param nomDuTest
	 * @param condition
	 */
	private static void verifier(String nomDuTest, boolean condition) {
        if (condition) {
            System.out.println("[OK] " + nomDuTest);
        } else {
            System.out.println("[ÉCHEC] " + nomDuTest);
        }
    }
	
}
