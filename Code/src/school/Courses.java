package school;
import java.time.LocalDate;


public class Courses {
    String nameCourse;
    Teacher teacherCourses;
    LocalDate dateBegin;
    LocalDate dateEnd;

    public Courses(String nameCourse, Teacher teacherCourses, LocalDate dateBegin, LocalDate dateEnd) {
        setNameCourse(nameCourse);
        setTeacherCourses(teacherCourses);
        this.dateBegin = dateBegin;
        this.dateEnd = dateEnd;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    public void setTeacherCourses(Teacher teacherCourses) {
        this.teacherCourses = teacherCourses;
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

}
