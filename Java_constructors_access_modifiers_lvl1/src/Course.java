public class Course {
    String courseName;
    int duration;
    double fee;

    static String instituteName = "Chitkara University";

    private Course(String courseName,int duration,double fee)
    {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails()
    {
        System.out.println("Course Name : "+courseName);
        System.out.println("Duration (Months) : "+duration);
        System.out.println("Fee (per semester) : "+fee);
        System.out.println("Institue Name : "+instituteName);
        System.out.println("=====================================");
    }


    private void updateInstituteName(String instituteName)
    {
        Course.instituteName = instituteName;
        System.out.println("Institute name updated successfully");
    }


    public static void main(String[] args) {

        Course course = new Course("CSE",48,85000);
        Course course1 = new Course("Hotel Management",24,60000);

        course.displayCourseDetails();
        Course.instituteName = "Chandigarh University";
        course1.displayCourseDetails();

    }


}
