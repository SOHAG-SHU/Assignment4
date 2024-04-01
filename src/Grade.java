import java.util.Scanner;
public class Grade {
    public double getNumericGrade(String letterGrade) {
        char grade = Character.toUpperCase(letterGrade.charAt(0));
        double numericGrade = 0.0;
        if (grade == 'A') {
            numericGrade = 4.0;
        } else if (grade == 'B') {
            numericGrade = 3.0;
        } else if (grade == 'C') {
            numericGrade = 2.0;
        } else if (grade == 'D') {
            numericGrade = 1.0;
        } else if (grade == 'F') {
            numericGrade = 0.0;
        } else {
            return -1.0; // Invalid input
        }

        if (letterGrade.length() > 1) {
            char modifier = letterGrade.charAt(1);
            if (modifier == '+') {
                numericGrade += 0.3;
            } else if (modifier == '-') {
                numericGrade -= 0.3;
            }
        }
        return numericGrade;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Grade gradeConverter = new Grade();
        System.out.print("Enter a letter grade: ");
        String letterGrade = scanner.nextLine();
        double numericGrade = gradeConverter.getNumericGrade(letterGrade);
        if (numericGrade == -1.0) {
            System.out.println("Invalid letter grade.");
        } else {
            System.out.println("The numeric value is " + numericGrade + ".");
        }
        scanner.close();
    }
}
