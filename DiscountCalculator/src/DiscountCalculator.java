import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the University Fee : ");
        double universityFee = sc.nextDouble();

        System.out.print("Enter the discount : ");
        double discount = sc.nextDouble();

        if (discount >= 0 && discount <= 100) {
            double discountedAmount = (discount / 100) * universityFee;
            double discountedFee = universityFee - discountedAmount;

            System.out.println(
                    "The discount amount is INR " + discountedAmount +
                            " and final discounted fee is INR " + discountedFee
            );
        } else {
            System.out.println("Invalid discount. Enter value between 0 and 100.");
        }


    }
}
