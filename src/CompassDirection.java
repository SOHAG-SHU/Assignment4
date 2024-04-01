import java.util.Scanner;
public class CompassDirection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the angle (in degrees):");
        int angle = scanner.nextInt();
        angle = (angle % 360 + 360) % 360;

        String direction;
        if (angle < 23 || angle >= 338) {
            direction = "N";
        } else if (angle < 68) {
            direction = "NE";
        } else if (angle < 113) {
            direction = "E";
        } else if (angle < 158) {
            direction = "SE";
        } else if (angle < 203) {
            direction = "S";
        } else if (angle < 248) {
            direction = "SW";
        } else if (angle < 293) {
            direction = "W";
        } else {
            direction = "NW";
        }

        System.out.println("Nearest compass direction: " + direction);
        scanner.close();
    }
}
