package schoolResults;

public class GradeCalculator {

    public void gradeCalculation(Student student)
    {
        System.out.println("Marksheet of "+student.name);

        for(Subject s : student.subjects)
        {
            System.out.println("==================================================");
            System.out.println("Subject Name : "+s.name);
            System.out.println("Marks : "+s.marks);
        }

    }


}
