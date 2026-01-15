public class Student {

    String name;
    int rollNumber;
    int marks;
    char grade;

    public Student(String name,int rollNumber,int marks)
    {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public char grade()
    {
        if(marks<=100 && marks>90)
        {
            return 'O';
        }
        else if(marks<=90 && marks>80)
        {
            return 'A';
        }
        else if(marks<=80 && marks>70)
        {
            return 'B';
        }
        else if(marks<=70 && marks>60)
        {
            return 'B';
        }
        else if(marks<=60 && marks>50)
        {
            return 'C';
        }
        else if(marks<=50 && marks>40) {
            return 'D';
        }
        return 'F';
    }

    public void displayInformation()
    {
        System.out.println("Student Name : "+name);
        System.out.println("Student Roll Number : "+rollNumber);
        System.out.println("Student Marks : "+marks);
        System.out.println("Student Grade : "+grade());
        System.out.println("===========================================");
    }

    public static void main(String[] args) {

        Student student = new Student("Kartik",1898,85);
        Student student1 = new Student("Ansh",3398,70);
        Student student2 = new Student("Aman",5898,35);

        student.displayInformation();
        student1.displayInformation();
        student2.displayInformation();
    }

}
