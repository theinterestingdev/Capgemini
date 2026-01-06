import java.util.Scanner;

class StoreValuesAndSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] values = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {
            double number = input.nextDouble();

            if (number <= 0 || index == values.length) {
                break;
            }

            values[index] = number;
            index++;
        }

        for (int i = 0; i < index; i++) {
            System.out.println(values[i]);
            total += values[i];
        }

        System.out.println("Total: " + total);
        input.close();
    }
}
