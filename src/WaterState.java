import java.util.Scanner;
public class WaterState {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature value: ");
        double temperature = scanner.nextDouble();
        System.out.print("Enter 'C' for Celsius or 'F' for Fahrenheit: ");
        char unit = scanner.next().charAt(0);
        if (unit == 'F' || unit == 'f') {
            temperature = (temperature - 32) * 5 / 9;
        }
        String state;
        if (temperature <= 0) {
            state = "solid";
        } else if (temperature >= 100) {
            state = "gaseous";
        } else {
            state = "liquid";
        }
        System.out.println("Water is " + state + " at the given temperature at sea level.");
        scanner.close();
    }
}
