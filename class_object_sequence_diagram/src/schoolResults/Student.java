package schoolResults;

import java.util.ArrayList;

public class Student {

    protected String name;
    ArrayList<Subject>subjects = new ArrayList<>();

    public Student(String name)
    {
        this.name = name;
    }

    public void addSubjects(Subject subject)
    {
        subjects.add(subject);
    }

    public void calculateGrade()
    {
        GradeCalculator gradeCalculator = new GradeCalculator();
        gradeCalculator.gradeCalculation(this);
    }

}
