import java.util.Scanner;
public class VowelConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a single character from the alphabet: ");
        String input = scanner.nextLine();
        if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
            System.out.println("Error: Please enter a single character from the alphabet.");
        } else {
            char ch = Character.toLowerCase(input.charAt(0)); // Convert to lowercase for simplicity
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        }
        scanner.close();
    }
}
