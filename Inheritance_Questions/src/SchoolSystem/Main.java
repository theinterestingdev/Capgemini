package SchoolSystem;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Mrs. Johnson", 35, "Mathematics");
        Student student = new Student("Alex", 16, "10th Grade");
        Staff staff = new Staff("Mr. Brown", 42, "Administration");

        teacher.displayRole();
        System.out.println();
        student.displayRole();
        System.out.println();
        staff.displayRole();
    }
}
