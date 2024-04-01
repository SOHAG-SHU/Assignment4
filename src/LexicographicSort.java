import java.util.Scanner;
public class LexicographicSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the three string: ");
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();
        String temp;
        if (str1.compareTo(str2) > 0) {
            temp = str1;
            str1 = str2;
            str2 = temp;
        }
        if (str1.compareTo(str3) > 0) {
            temp = str1;
            str1 = str3;
            str3 = temp;
        }
        if (str2.compareTo(str3) > 0) {
            temp = str2;
            str2 = str3;
            str3 = temp;
        }
        System.out.println("Sorted strings:");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        scanner.close();
    }
}
