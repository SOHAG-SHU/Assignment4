import java.util.*;
class Month {
    private int monthNumber;
    public Month(int monthNumber) {
        this.monthNumber = monthNumber;
    }
    public int getLength() {
        int days;
        if (monthNumber == 1 || monthNumber == 3 || monthNumber == 5 || monthNumber == 7 ||
                monthNumber == 8 || monthNumber == 10 || monthNumber == 12) {
            days = 31;
        } else if (monthNumber == 4 || monthNumber == 6 || monthNumber == 9 || monthNumber == 11) {
            days = 30;
        } else if (monthNumber == 2) {
            days = 28;
        } else {
            days = -1;
        }
        return days;
    }
}
public class MonthDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a month (1 for January, 2 for February, etc.): ");
        int monthNumber = scanner.nextInt();
        Month month = new Month(monthNumber);
        int days = month.getLength();

        if (days == -1) {
            System.out.println("Invalid month number.");
        } else {
            System.out.println(days + " days");
        }
        scanner.close();
    }
}
