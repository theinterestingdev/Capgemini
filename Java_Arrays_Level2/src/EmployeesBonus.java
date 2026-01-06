import java.util.Scanner;

public class EmployeesBonus {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double salary[] = new double[10];
        double yearsOfService[] = new double[10];
        double newSalary[] = new double[10];
        double bonusAmount[] = new double[10];

        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        for(int i = 0;i<salary.length;i++)
        {

            double salaryInput = input.nextDouble();
            double years = input.nextDouble();


            if(salaryInput<=0 || years<0)
            {
                i--;
                System.out.println("Enter the input again invalid input received : ");
                continue;
            }
            salary[i] = salaryInput;
            yearsOfService[i] = years;

            totalOldSalary += salaryInput;
        }


        for(int i = 0;i<salary.length;i++)
        {
            if(yearsOfService[i]>5)
            {
                bonusAmount[i] = salary[i] * 0.05;
            }
            else
            {
                bonusAmount[i] = salary[i] * 0.02;
            }
            newSalary[i] = salary[i] + bonusAmount[i];

            totalBonus += bonusAmount[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Paid: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);

        input.close();



    }


}
