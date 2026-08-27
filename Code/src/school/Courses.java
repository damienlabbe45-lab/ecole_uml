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

    public void remove(Courses cours){
        if(listCourse.contains(cours))listCourse.remove(cours);
        else throw new IllegalArgumentException(" le cours n'existe pas");
    }

    public void updateTeacher(Courses cours, Teacher teacherCourses){
        if(listCourse.contains(cours)){
            Courses courses = listCourse.get(listCourse.indexOf(cours));
            if(!courses.teacherCourses.equals(teacherCourses))courses.teacherCourses = teacherCourses;
            else throw new IllegalArgumentException("Vous demandez de remplacer l'enseignant par la même personne");

        }
        else throw new IllegalArgumentException(" le cours n'existe pas");
    }

}
