package school;
import java.time.LocalDate;
import java.util.Objects;
import java.util.ArrayList;

/**
 * Représente un cours dispensé par un enseignant sur une période donnée.
 * Cette classe maintient également une liste globale de tous les cours instanciés.
 * 
 * @version 1.0
 */


public class Courses {
    /** Nom du cours. */
    String nameCourse;

    /** Enseignant responsable du cours. */
    Teacher teacherCourses;
    /** Date de début du cours. */
    LocalDate dateBegin;
    /** Date de fin du cours. */
    LocalDate dateEnd;
    /** Registre global de l'ensemble des cours créés. sert juste à simuler une table de base de donnée */
    static ArrayList<Courses> listCourse = new ArrayList<>();

    final ArrayList<Student> students = new ArrayList<>();

    public Courses(String nameCourse, Teacher teacherCourses, LocalDate dateBegin, LocalDate dateEnd) {
        /**
     * Crée un nouveau cours et l'ajoute automatiquement au registre global.
     *
     * @param nameCourse     le nom du cours (ne doit pas être null)
     * @param teacherCourses l'enseignant responsable (ne doit pas être null)
     * @param dateBegin      la date de début (ne doit pas être null)
     * @param dateEnd        la date de fin (doit être au moins le lendemain de dateBegin)
     * @throws NullPointerException     si l'un des arguments est null
     * @throws IllegalArgumentException si dateBegin n'est pas strictement antérieure à dateEnd
     */
        setNameCourse(nameCourse);
        setTeacherCourses(teacherCourses);
        setDate(dateBegin, dateEnd);
        listCourse.add(this);
    }

    public void setNameCourse(String nameCourse) {
        /**
     * Modifie le nom du cours.
     *
     * @param nameCourse le nouveau nom
     * @throws NullPointerException si nameCourse est null
     */
        Objects.requireNonNull(nameCourse, "le nom du cours ne peut pas être nul");
        this.nameCourse = nameCourse;
    }

    public void setTeacherCourses(Teacher teacherCourses) {
        /**
     * Modifie l'enseignant du cours.
     *
     * @param teacherCourses le nouvel enseignant
     * @throws NullPointerException si teacherCourses est null
     */
        Objects.requireNonNull(teacherCourses, "l'enseignant ne peut pas être nul");
        this.teacherCourses = teacherCourses;
    }

    public void setDate(LocalDate dateBegin, LocalDate dateEnd) {
        /**
     * Définit et valide les dates de début et de fin du cours.
     *
     * @param dateBegin la date de début
     * @param dateEnd   la date de fin
     * @throws NullPointerException     si l'une des dates est null
     * @throws IllegalArgumentException si la date de fin n'est pas postérieure à la date de début
     */
        Objects.requireNonNull(dateBegin, "la date du début ne peut pas être nulle");
        Objects.requireNonNull(dateEnd, "la date de fin ne peut pas être nulle");
        if(dateBegin.isBefore(dateEnd)){
        this.dateBegin = dateBegin;
        this.dateEnd = dateEnd;
        }
        else throw new IllegalArgumentException(
            "La date de fin (" + dateEnd + ") doit être au moins le lendemain de la date de début (" + dateBegin + ")."
        );
    }

    public String getNameCourse() {
        return this.nameCourse;
    }

    public Teacher getTeacherCourses() {
        return this.teacherCourses;
    }
    
    public LocalDate getDateBegin() {
        return this.dateBegin;
    }
    public LocalDate getDateEnd() {
        return this.dateEnd;
    }

    public static void remove(Courses cours){
        /**
     * Supprime un cours de la liste globale.
     *
     * @param cours le cours à retirer
     * @throws IllegalArgumentException si le cours n'existe pas dans le registre
     */
        if(listCourse.contains(cours))listCourse.remove(cours);

        else throw new IllegalArgumentException(" le cours n'existe pas");
        
    }
    
    public static void updateTeacher(Courses cours, Teacher newTeacher) {
        /**
     * Mettre à jour l'enseignant d'un cours existant.
     *
     * @param cours      le cours concerné
     * @param newTeacher le nouvel enseignant
     * @throws NullPointerException     si cours ou newTeacher est null
     * @throws IllegalArgumentException si le cours n'est pas dans la liste ou si l'enseignant est identique
     */
        Objects.requireNonNull(cours, "Le cours ne peut pas être nul");
        Objects.requireNonNull(newTeacher, "L'enseignant ne peut pas être nul");
    
        if (!listCourse.contains(cours)) throw new IllegalArgumentException("Le cours n'existe pas dans la liste.");
    
        if (cours.getTeacherCourses().equals(newTeacher)) throw new IllegalArgumentException("Même enseignant.");
    
        cours.setTeacherCourses(newTeacher);
}
    

    public static void updateNameCourse(Courses cours, String newName) {
        /**
     * Mettre à jour le nom d'un cours existant.
     *
     * @param cours   le cours concerné
     * @param newName le nouveau nom
     * @throws NullPointerException     si newName est null
     * @throws IllegalArgumentException si le cours n'est pas dans la liste ou si le nom est identique
     */
        Objects.requireNonNull(newName, "Le nom du cours ne peut pas être nul");
        if (!listCourse.contains(cours)) throw new IllegalArgumentException("Le cours n'existe pas");
        
        if (cours.getNameCourse().equals(newName)) throw new IllegalArgumentException("Le cours porte déjà ce nom");
        
        cours.setNameCourse(newName);
    }

    public static void updateLocalDate(Courses cours, LocalDate date, String typeDate) {
        /**
     * Mettre à jour une date (début ou fin) pour un cours existant.
     *
     * @param cours    le cours concerné
     * @param date     la nouvelle date
     * @param typeDate le type de date à modifier ("debut" ou "fin")
     * @throws NullPointerException     si date ou typeDate est null
     * @throws IllegalArgumentException si le cours n'existe pas, si typeDate est invalide ou si la cohérence des dates n'est pas respectée
     */
        Objects.requireNonNull(date, "La date ne peut pas être nulle");
        Objects.requireNonNull(typeDate, "Le type de date ne peut pas être nul");

        if (!listCourse.contains(cours)) throw new IllegalArgumentException("Le cours n'existe pas");
        

        if ("debut".equalsIgnoreCase(typeDate)) {

            if (date.isBefore(cours.getDateEnd())) cours.dateBegin = date;

            else throw new IllegalArgumentException("La date de début doit être antérieure à la date de fin.");
            
        } 
        
        else if ("fin".equalsIgnoreCase(typeDate)) {

            if (cours.getDateBegin().isBefore(date)) cours.dateEnd = date;

            else throw new IllegalArgumentException("La date de fin doit être postérieure à la date de début.");
            
        } else throw new IllegalArgumentException("Le cours existe mais vous n'avez mis ni 'debut' ni 'fin'.");
        
    }

    @Override
    public String toString() {
        return "Le cours " + this.nameCourse + " est enseigné par " + teacherCourses.getName() + " " + teacherCourses.getSurname() + 
        ". Il commence du " + this.dateBegin + " jusqu'au " + this.dateEnd + ".";
    }

    public static void allcoursesTeacher(Teacher teacher){
        for(Courses course: listCourse){
            if(course.getTeacherCourses() == teacher) {
            	System.out.println(course);
            }
        }
    }

    public void addStudent(Student student) {
        /**
         * Inscrit un étudiant au cours.
         */
    Objects.requireNonNull(student, "L'étudiant ne peut pas être nul");
    if (!this.students.contains(student)) this.students.add(student);
    }

    public boolean removeStudent(Student student) {
        /**
         * Désinscrit un étudiant du cours.
         */
        return this.students.remove(student);

        }

    public ArrayList<Student> getStudents(){
        return new ArrayList<>(this.students);
    }


}
