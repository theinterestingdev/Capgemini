import java.util.Random;

public class EmployeeBonus {
    public static void main(String[] args) {
        double[][] employeeData = generateEmployeeData();

        System.out.println("Employee Old Salaries and Years of Service:");
        System.out.printf("%-10s %-10s %-10s\n", "Employee", "Salary", "Years");
        for (int i = 0; i < employeeData.length; i++) {
            System.out.printf("%-10d %-10.2f %-10.0f\n", (i+1), employeeData[i][0], employeeData[i][1]);
        }

        double[][] newData = calculateNewSalaryAndBonus(employeeData);

        System.out.println("\nEmployee New Salaries and Bonuses:");
        System.out.printf("%-10s %-10s %-10s\n", "Employee", "New Salary", "Bonus");
        for (int i = 0; i < newData.length; i++) {
            System.out.printf("%-10d %-10.2f %-10.2f\n", (i+1), newData[i][0], newData[i][1]);
        }

        displaySums(employeeData, newData);
    }

    private static double[][] generateEmployeeData() {
        Random random = new Random();
        double[][] data = new double[10][2];
        for (int i = 0; i < 10; i++) {
            data[i][0] = 10000 + random.nextInt(90000); // 10000 to 99999
            data[i][1] = 1 + random.nextInt(10); // 1 to 10 years
        }
        return data;
    }

    private static double[][] calculateNewSalaryAndBonus(double[][] employeeData) {
        double[][] newData = new double[10][2];
        for (int i = 0; i < 10; i++) {
            double salary = employeeData[i][0];
            int years = (int) employeeData[i][1];
            double bonusPercentage = (years > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusPercentage;
            double newSalary = salary + bonus;
            newData[i][0] = newSalary;
            newData[i][1] = bonus;
        }
        return newData;
    }

    private static void displaySums(double[][] oldData, double[][] newData) {
        double sumOldSalary = 0;
        double sumNewSalary = 0;
        double sumBonus = 0;

        for (int i = 0; i < 10; i++) {
            sumOldSalary += oldData[i][0];
            sumNewSalary += newData[i][0];
            sumBonus += newData[i][1];
        }

        System.out.println("\nSummary:");
        System.out.printf("%-20s %-10.2f\n", "Sum of Old Salaries:", sumOldSalary);
        System.out.printf("%-20s %-10.2f\n", "Sum of New Salaries:", sumNewSalary);
        System.out.printf("%-20s %-10.2f\n", "Total Bonus Amount:", sumBonus);
    }
}