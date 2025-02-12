import java.util.Scanner;

public class SquareRootCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate its square root: ");

        try {
            // Read input as a double
            double number = scanner.nextDouble();

            // Check if the number is non-negative
            if (number < 0) {
                throw new IllegalArgumentException("Cannot calculate square root of a negative number");
            }

            // Calculate and print square root
            double squareRoot = Math.sqrt(number);
            System.out.println("Square root of " + number + " is: " + squareRoot);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Invalid input");
        } finally {
            // Close scanner
            scanner.close();
        }
    }
}
