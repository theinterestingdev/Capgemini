package schoolResults;

public class Main {

    public static void main(String[] args) {

        Student kartik = new Student("Kartik");
        kartik.addSubjects(new Subject("Maths",90));
        kartik.addSubjects(new Subject("English",95));

        kartik.calculateGrade();
    }




}
