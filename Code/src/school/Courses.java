package school;
import java.time.LocalDate;
import java.util.Objects;
import java.util.ArrayList;


public class Courses {
    String nameCourse;
    Teacher teacherCourses;
    LocalDate dateBegin;
    LocalDate dateEnd;
    static ArrayList<Courses> listCourse = new ArrayList<>();

    public Courses(String nameCourse, Teacher teacherCourses, LocalDate dateBegin, LocalDate dateEnd) {
        setNameCourse(nameCourse);
        setTeacherCourses(teacherCourses);
        setDate(dateBegin, dateEnd);
        listCourse.add(this);
    }

    public void setNameCourse(String nameCourse) {
        Objects.requireNonNull(nameCourse, "le nom du cours ne peut pas être nul");
        this.nameCourse = nameCourse;
    }

    public void setTeacherCourses(Teacher teacherCourses) {
        Objects.requireNonNull(teacherCourses, "l'enseignant ne peut pas être nul");
        this.teacherCourses = teacherCourses;
    }

    public void setDate(LocalDate dateBegin, LocalDate dateEnd) {
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
        return nameCourse;
    }

    public Teacher getTeacherCourses() {
        return teacherCourses;
    }
    
    public LocalDate getDateBegin() {
        return dateBegin;
    }
    public LocalDate getDateEnd() {
        return dateEnd;
    }

    public static void remove(Courses cours){

        if(listCourse.contains(cours))listCourse.remove(cours);

        else throw new IllegalArgumentException(" le cours n'existe pas");
        
    }
    
    public static void updateTeacher(Courses cours, Teacher newTeacher) {
        Objects.requireNonNull(cours, "Le cours ne peut pas être nul");
        Objects.requireNonNull(newTeacher, "L'enseignant ne peut pas être nul");
    
        if (!listCourse.contains(cours)) throw new IllegalArgumentException("Le cours n'existe pas dans la liste.");
    
        if (cours.getTeacherCourses().equals(newTeacher)) throw new IllegalArgumentException("Même enseignant.");
    
        cours.setTeacherCourses(newTeacher);
}
    

    public static void updateNameCourse(Courses cours, String newName) {
        Objects.requireNonNull(newName, "Le nom du cours ne peut pas être nul");
        if (!listCourse.contains(cours)) throw new IllegalArgumentException("Le cours n'existe pas");
        
        if (cours.getNameCourse().equals(newName)) throw new IllegalArgumentException("Le cours porte déjà ce nom");
        
        cours.setNameCourse(newName);
    }

    public static void updateLocalDate(Courses cours, LocalDate date, String typeDate) {
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
        return "Le cours " + nameCourse + " est enseigné par " + teacherCourses + ". Il commence du " + dateBegin
                + " jusqu'au " + dateEnd + ".";
    }

    

}
