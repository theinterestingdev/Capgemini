import java.util.*;

abstract class CourseType {
    abstract String getEvaluationType();
}

class ExamCourse extends CourseType {
    String getEvaluationType() {
        return "Exam Based";
    }
}

class AssignmentCourse extends CourseType {
    String getEvaluationType() {
        return "Assignment Based";
    }
}

class ResearchCourse extends CourseType {
    String getEvaluationType() {
        return "Research Based";
    }
}

class Course<T extends CourseType> {
    private String courseName;
    private T type;

    public Course(String courseName, T type) {
        this.courseName = courseName;
        this.type = type;
    }

    public void display() {
        System.out.println(courseName + " - " + type.getEvaluationType());
    }
}

public class UniversityApp {
    static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType c : courses) {
            System.out.println(c.getEvaluationType());
        }
    }

    public static void main(String[] args) {
        Course<ExamCourse> math = new Course<>("Mathematics", new ExamCourse());
        Course<ResearchCourse> phd = new Course<>("PhD Research", new ResearchCourse());

        math.display();
        phd.display();

        List<CourseType> list = new ArrayList<>();
        list.add(new ExamCourse());
        list.add(new AssignmentCourse());

        displayCourses(list);
    }
}
