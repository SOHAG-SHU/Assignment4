import java.util.Scanner;
public class CardDescription {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the card notation: ");
        String cardNotation = scanner.nextLine();
        String cardDescription = parseCardNotation(cardNotation);
        System.out.println(cardDescription);
        scanner.close();
    }
    public static String parseCardNotation(String cardNotation) {
        String value = "";
        String suit = "";
        if (cardNotation.charAt(0) == 'A') {
            value = "Ace";
        } else if (cardNotation.charAt(0) == 'J') {
            value = "Jack";
        } else if (cardNotation.charAt(0) == 'Q') {
            value = "Queen";
        } else if (cardNotation.charAt(0) == 'K') {
            value = "King";
        } else if (cardNotation.charAt(0) >= '2' && cardNotation.charAt(0) <= '9') {
            value = String.valueOf(cardNotation.charAt(0));
        } else if (cardNotation.charAt(0) == '1') {
            value = "10";
        } else {
            return "Invalid card value";
        }
        if (cardNotation.charAt(1) == 'D') {
            suit = "Diamonds";
        } else if (cardNotation.charAt(1) == 'H') {
            suit = "Hearts";
        } else if (cardNotation.charAt(1) == 'S') {
            suit = "Spades";
        } else if (cardNotation.charAt(1) == 'C') {
            suit = "Clubs";
        } else {
            return "Invalid card suit";
        }

        return value + " of " + suit;
    }
}
