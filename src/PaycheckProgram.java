import java.text.DecimalFormat;
import java.util.Scanner;
class Paycheck {
    private String employeeName;
    private double hourlyWage;
    private double hoursWorked;
    public Paycheck(String employeeName, double hourlyWage, double hoursWorked) {
        this.employeeName = employeeName;
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }
    public double calculatePay() {
        double regularPay;
        double overtimePay = 0;
        if (hoursWorked <= 40) {
            regularPay = hoursWorked * hourlyWage;
        } else {
            regularPay = 40 * hourlyWage;
            overtimePay = (hoursWorked - 40) * hourlyWage * 1.5;
        }
        return regularPay + overtimePay;
    }
    public void printPaycheck() {
        DecimalFormat df = new DecimalFormat("#.##");
        double totalPay = calculatePay();
        System.out.println("\nEmployee Name: " + employeeName);
        System.out.println("Regular Pay: $" + df.format(calculatePay()));
    }
}
public class PaycheckProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        String employeeName = scanner.nextLine();
        System.out.print("Enter hourly wage: $");
        double hourlyWage = scanner.nextDouble();
        System.out.print("Enter hours worked in the past week: ");
        double hoursWorked = scanner.nextDouble();
        Paycheck paycheck = new Paycheck(employeeName, hourlyWage, hoursWorked);
        paycheck.printPaycheck();
        scanner.close();
    }
}
