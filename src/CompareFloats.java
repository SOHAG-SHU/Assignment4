import java.util.Scanner;
public class CompareFloats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the two floating-point number: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        boolean areSameUpToTwoDecimalPlaces = compareUpToTwoDecimalPlaces(num1, num2);

        if (areSameUpToTwoDecimalPlaces) {
            System.out.println("They are the same up to two decimal places.");
        } else {
            System.out.println("They are different.");
        }
        scanner.close();
    }

    public static boolean compareUpToTwoDecimalPlaces(double num1, double num2) {
        double roundedNum1 = Math.round(num1 * 100) / 100.0;
        double roundedNum2 = Math.round(num2 * 100) / 100.0;
        return Double.compare(roundedNum1, roundedNum2) == 0;
    }
}
