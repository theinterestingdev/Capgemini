import java.util.Scanner;

public class StudentVoteChecker {

    public boolean canVote(int age) {

        if (age < 0) {
            return false;
        }

        if (age >= 18) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentVoteChecker checker = new StudentVoteChecker();

        int[] ages = new int[10];

        for (int i = 0; i < ages.length; i++) {

            ages[i] = sc.nextInt();

            boolean result = checker.canVote(ages[i]);

            if (result) {
                System.out.println("Student " + (i + 1) + " can vote");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote");
            }
        }
    }
}
