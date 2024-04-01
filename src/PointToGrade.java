import java.util.Scanner;
public class PointToGrade {
    public static String getLetterGrade(double pointGrade) {
        if (pointGrade < 0 || pointGrade > 4) {
            return "Invalid grade";
        }
        if (pointGrade >= 3.85) {
            return "A";
        } else if (pointGrade >= 3.5) {
            return "A-";
        } else if (pointGrade >= 3.15) {
            return "B+";
        } else if (pointGrade >= 2.85) {
            return "B";
        } else if (pointGrade >= 2.5) {
            return "B-";
        } else if (pointGrade >= 2.15) {
            return "C+";
        } else if (pointGrade >= 1.85) {
            return "C";
        } else if (pointGrade >= 1.5) {
            return "C-";
        } else if (pointGrade >= 1.15) {
            return "D+";
        } else if (pointGrade >= 0.85) {
            return "D";
        } else {
            return "D-";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the point grade (0 to 4):");
        double pointGrade = scanner.nextDouble();
        String letterGrade = getLetterGrade(pointGrade);
        System.out.println("The letter grade is: " + letterGrade);
        scanner.close();
    }
}
