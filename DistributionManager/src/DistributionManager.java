import java.util.Scanner;

public class DistributionManager {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of pens : ");
        int numberOfPens = sc.nextInt();

        System.out.print("Enter the number of students : ");
        int numberOfStudents = sc.nextInt();

        if(numberOfStudents>0) {
            int nonDistributedPens = numberOfPens % numberOfStudents;
            System.out.println("The Pen Per Student is " + numberOfPens / numberOfStudents + " and the remaining pen not distributed is " + nonDistributedPens);
        }
        else {
            System.out.println("Number of students must be greater than 0");
        }
    }
}