import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter birth year : ");
        int birthYear = sc.nextInt();
        System.out.print("Enter current year : ");
        int currentYear = sc.nextInt();

        System.out.print("Current Age : ");
        int currentAge = currentYear - birthYear;

        System.out.println(currentAge);
    }
}