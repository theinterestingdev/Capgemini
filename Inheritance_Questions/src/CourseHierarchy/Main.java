package CourseHierarchy;

public class Main {
    public static void main(String[] args) {
        PaidOnlineCourse course = new PaidOnlineCourse(
            "Java Programming",
            120,
            "Udemy",
            true,
            99.99,
            20
        );
        course.displayInfo();
    }
}
