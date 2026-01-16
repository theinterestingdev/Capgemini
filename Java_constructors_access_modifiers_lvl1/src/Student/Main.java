package Student;

class Student {

    public int rollNumber;
    protected String name;
    private double CGPA;


    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }


    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    public void display() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}


class PostgraduateStudent extends Student {

    private String thesisTopic;

    public PostgraduateStudent(int rollNumber, String name, double CGPA, String thesisTopic) {
        super(rollNumber, name, CGPA);
        this.thesisTopic = thesisTopic;
    }

    public void showPGDetails() {
        System.out.println("PG Student.Student Name (protected): " + name);
        System.out.println("Thesis Topic: " + thesisTopic);
    }
}


public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Kartik", 8.75);
        s1.display();


        s1.setCGPA(9.1);
        System.out.println("Updated CGPA: " + s1.getCGPA());

        System.out.println();


        PostgraduateStudent pg = new PostgraduateStudent(202, "Sharma", 9.4, "AI Research");
        pg.showPGDetails();
    }
}
