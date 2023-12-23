import java.util.Scanner;

public class MultiplicationTable {

    public static void printMultiplicationTable(int number, int limit) {
        System.out.println("Multiplication Table for " + number + " up to " + limit + " multiples:");

        for (int i = 1; i <= limit; i++) {
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }
    }

    public static void main(String[] args) {
        // Use Scanner to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int inputNumber = scanner.nextInt();

        // Prompt the user to enter the limit
        //System.out.print("Enter the limit (number of multiples): ");
        int tableLimit = 10;

        // Call the function with user input
        printMultiplicationTable(inputNumber, tableLimit);

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
