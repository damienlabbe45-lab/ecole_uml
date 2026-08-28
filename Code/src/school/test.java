package school;

import java.time.LocalDate;
import java.util.ArrayList;

public class test {
	public static void main(String[] args) {
		// Test de la classe Admin
        Admin admin = new Admin(2, "Alice", "Dupont");
        verifier("Admin hérite de User", admin instanceof Users);
        Director directeur = new Director(1, "Robert", "Dupont"); 
        
        // Création des enseignants
        Teacher jdoeTeacher = directeur.create_teacher(0, "John", "Doe", new Adresse("Auch"));
        Teacher john = directeur.create_teacher(
                10,
                "John",
                "Doe",
                new Adresse("Auch")
        );

        Teacher marie = directeur.create_teacher(
                11,
                "Marie",
                "Martin",
                new Adresse("Toulouse")
        );

        Teacher paul = directeur.create_teacher(
                12,
                "Paul",
                "Durand",
                new Adresse("Blagnac")
        );

        Teacher sarah = directeur.create_teacher(
                13,
                "Sarah",
                "Bernard",
                new Adresse("Colomiers")
        );

        Teacher lucas = directeur.create_teacher(
                14,
                "Lucas",
                "Petit",
                new Adresse("Muret")
        );
        
        // Création des students
        Student student = new Student (2, "Anaïs", "Binet", new Adresse("Toulous"));
        Student anais = new Student(
                20, "Anaïs", "Binet",
                new Adresse("Toulouse")
        );

        Student victor = new Student(
                21, "Victor", "Martin",
                new Adresse("Toulouse")
        );

        Student lea = new Student(
                22, "Léa", "Robert",
                new Adresse("Auch")
        );

        Student hugo = new Student(
                23, "Hugo", "Bernard",
                new Adresse("Blagnac")
        );

        Student emma = new Student(
                24, "Emma", "Petit",
                new Adresse("Colomiers")
        );

        Student nathan = new Student(
                25, "Nathan", "Durand",
                new Adresse("Muret")
        );

        Student ines = new Student(
                26, "Inès", "Moreau",
                new Adresse("Toulouse")
        );

        Student adam = new Student(
                27, "Adam", "Garcia",
                new Adresse("Auch")
        );

        Student chloe = new Student(
                28, "Chloé", "Leroy",
                new Adresse("Blagnac")
        );

        Student louis = new Student(
                29, "Louis", "Roux",
                new Adresse("Colomiers")
        );

        Student jade = new Student(
                30, "Jade", "Fournier",
                new Adresse("Muret")
        );

        Student tom = new Student(
                31, "Tom", "Mercier",
                new Adresse("Toulouse")
        );
        
        // Création des cours
        Courses cours = directeur.createCours("Algorithmique", LocalDate.of(2026, 6, 22), LocalDate.of(2026, 8, 12), jdoeTeacher);
        Courses algorithmique = directeur.createCours(
                "Algorithmique",
                LocalDate.of(2026, 6, 22),
                LocalDate.of(2026, 8, 12),
                john
        );

        Courses java = directeur.createCours(
                "Java",
                LocalDate.of(2026, 9, 1),
                LocalDate.of(2026, 10, 15),
                john
        );

        Courses python = directeur.createCours(
                "Python",
                LocalDate.of(2026, 9, 5),
                LocalDate.of(2026, 11, 20),
                marie
        );

        Courses basesDeDonnees = directeur.createCours(
                "Bases de données",
                LocalDate.of(2026, 10, 1),
                LocalDate.of(2026, 12, 10),
                marie
        );

        Courses uml = directeur.createCours(
                "UML",
                LocalDate.of(2026, 8, 20),
                LocalDate.of(2026, 9, 30),
                paul
        );

        Courses git = directeur.createCours(
                "Git et GitHub",
                LocalDate.of(2026, 9, 10),
                LocalDate.of(2026, 10, 10),
                paul
        );

        Courses htmlCss = directeur.createCours(
                "HTML et CSS",
                LocalDate.of(2026, 9, 15),
                LocalDate.of(2026, 11, 1),
                sarah
        );

        Courses javascript = directeur.createCours(
                "JavaScript",
                LocalDate.of(2026, 10, 5),
                LocalDate.of(2026, 12, 15),
                sarah
        );

        Courses reseaux = directeur.createCours(
                "Réseaux",
                LocalDate.of(2026, 11, 2),
                LocalDate.of(2027, 1, 20),
                lucas
        );

        Courses securite = directeur.createCours(
                "Sécurité informatique",
                LocalDate.of(2026, 11, 15),
                LocalDate.of(2027, 2, 10),
                lucas
        );

        // Ajout des étudiants aux cours
        algorithmique.addStudent(anais);
        algorithmique.addStudent(victor);
        algorithmique.addStudent(lea);
        algorithmique.addStudent(hugo);

        java.addStudent(anais);
        java.addStudent(victor);
        java.addStudent(emma);
        java.addStudent(nathan);

        python.addStudent(lea);
        python.addStudent(hugo);
        python.addStudent(ines);
        python.addStudent(adam);

        basesDeDonnees.addStudent(anais);
        basesDeDonnees.addStudent(ines);
        basesDeDonnees.addStudent(chloe);
        basesDeDonnees.addStudent(louis);

        uml.addStudent(victor);
        uml.addStudent(lea);
        uml.addStudent(jade);
        uml.addStudent(tom);

        git.addStudent(anais);
        git.addStudent(hugo);
        git.addStudent(nathan);
        git.addStudent(tom);

        htmlCss.addStudent(emma);
        htmlCss.addStudent(ines);
        htmlCss.addStudent(chloe);
        htmlCss.addStudent(jade);

        javascript.addStudent(victor);
        javascript.addStudent(adam);
        javascript.addStudent(louis);
        javascript.addStudent(tom);

        reseaux.addStudent(anais);
        reseaux.addStudent(nathan);
        reseaux.addStudent(chloe);
        reseaux.addStudent(louis);

        securite.addStudent(hugo);
        securite.addStudent(ines);
        securite.addStudent(adam);
        securite.addStudent(jade);
        
        cours.addStudent(student);
        
        
        // Liste de cours
        ArrayList<Courses>listeCours = new ArrayList<Courses>();
        
        listeCours.add(algorithmique);
        listeCours.add(java);
        listeCours.add(python);
        listeCours.add(basesDeDonnees);
        listeCours.add(uml);
        listeCours.add(git);
        listeCours.add(htmlCss);
        listeCours.add(javascript);
        listeCours.add(reseaux);
        listeCours.add(securite);
        listeCours.add(cours);
        
        /*
         * Affichage de tous les cours par le directeur
         */

        System.out.println("\n==============================");
        System.out.println("TOUS LES COURS");
        System.out.println("==============================");

        directeur.show_courses(listeCours);

        /*
         * Affichage des cours de chaque enseignant
         */

        System.out.println("\n==============================");
        System.out.println("COURS DE JOHN DOE");
        System.out.println("==============================");

        john.show_courses(listeCours);

        System.out.println("\n==============================");
        System.out.println("COURS DE MARIE MARTIN");
        System.out.println("==============================");

        marie.show_courses(listeCours);

        System.out.println("\n==============================");
        System.out.println("COURS DE PAUL DURAND");
        System.out.println("==============================");

        paul.show_courses(listeCours);

        System.out.println("\n==============================");
        System.out.println("COURS DE SARAH BERNARD");
        System.out.println("==============================");

        sarah.show_courses(listeCours);

        System.out.println("\n==============================");
        System.out.println("COURS DE LUCAS PETIT");
        System.out.println("==============================");

        lucas.show_courses(listeCours);

        /*
         * Affichage des cours de certains élèves
         */

        System.out.println("\n==============================");
        System.out.println("COURS D'ANAÏS");
        System.out.println("==============================");

        anais.show_courses(listeCours);
        System.out.println(anais.getAdresse().toString());

        System.out.println("\n==============================");
        System.out.println("COURS DE VICTOR");
        System.out.println("==============================");

        victor.show_courses(listeCours);
        System.out.println(victor.getAdresse().toString());

        System.out.println("\n==============================");
        System.out.println("COURS DE LÉA");
        System.out.println("==============================");

        lea.show_courses(listeCours);
        System.out.println(lea.getAdresse().toString());

        System.out.println("\n==============================");
        System.out.println("COURS DE HUGO");
        System.out.println("==============================");

        hugo.show_courses(listeCours);
        System.out.println(hugo.getAdresse().toString());

        
        /*
         * Tests des enseignants associés aux cours
         */

        verifier(
                "John enseigne l'algorithmique",
                algorithmique.getTeacherCourses() == john
        );

        verifier(
                "John enseigne Java",
                java.getTeacherCourses() == john
        );

        verifier(
                "Marie enseigne Python",
                python.getTeacherCourses() == marie
        );

        verifier(
                "Paul enseigne UML",
                uml.getTeacherCourses() == paul
        );

        verifier(
                "Sarah enseigne JavaScript",
                javascript.getTeacherCourses() == sarah
        );

        verifier(
                "Lucas enseigne la sécurité",
                securite.getTeacherCourses() == lucas
        );

        /*
         * Test volontairement négatif :
         * il réussit si John n'enseigne pas Python.
         */

        verifier(
                "John n'enseigne pas Python",
                python.getTeacherCourses() != john
        );

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

	/**
     * Créer une méthode qui mime les assertions traditionnelles java
     * @param condition
     * @param message
     */
	static void assertionTruePerso(boolean condition, String message) {
        if (condition) {
            throw new AssertionError("Test échoué " + message);
        }
        System.out.println("Test réussi " + message);
    }
	
}
