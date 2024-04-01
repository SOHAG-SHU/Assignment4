import java.util.Scanner;
public class CouponCalculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the cost of your groceries: ");
        double amountSpent = scanner.nextDouble();
        double couponPercentage;
        if (amountSpent < 10) {
            couponPercentage = 0;
        } else if (amountSpent <= 60) {
            couponPercentage = 0.08;
        } else if (amountSpent <= 150) {
            couponPercentage = 0.10;
        } else if (amountSpent <= 210) {
            couponPercentage = 0.12;
        } else {
            couponPercentage = 0.14;
        }
        double couponValue = amountSpent * couponPercentage;
        System.out.println("You win a discount coupon of $" + couponValue + ". (" + (couponPercentage * 100) + "% of your purchase)");
        scanner.close();
    }
}
