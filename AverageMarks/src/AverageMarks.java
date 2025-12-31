import java.util.Scanner;

public class AverageMarks
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks in Maths : ");
        int marksInMaths = sc.nextInt();
        System.out.print("Enter marks in Physics : ");
        int marksInPhysics = sc.nextInt();
        System.out.print("Enter marks in Chemistry : ");
        int marksInChemistry = sc.nextInt();
        System.out.print("Enter total marks : ");
        int totalMarks = sc.nextInt();

        double averagePercentMarksInPcm = ((marksInMaths + marksInPhysics + marksInChemistry)*100.0)/totalMarks;

        System.out.print("Average Percent Marks in PCM : "+averagePercentMarksInPcm+" %");






    }
}

