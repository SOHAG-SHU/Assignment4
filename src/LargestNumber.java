import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter three numbers: ");
        float num1 = scanner.nextFloat();
        float num2 = scanner.nextFloat();
        float num3 = scanner.nextFloat();
        float largestNumber = findLargest(num1, num2, num3);
        System.out.println("The largest number is " + largestNumber);
        scanner.close();
    }
    public static float findLargest(float num1, float num2, float num3) {
        float largest = num1;
        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }
        return largest;
    }
}

