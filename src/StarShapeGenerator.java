import java.util.Scanner;

public class StarShapeGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        if (scanner.hasNextInt()) {
            int input = scanner.nextInt();
            generateStarPattern(input);
        } else {
            System.out.println("Invalid input. Please enter a number.");
        }

        // Close the scanner
        scanner.close();
    }

    private static void generateStarPattern(int n) {
        // Generate star pattern based on user input
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

