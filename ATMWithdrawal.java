import java.util.Scanner;

public class ATMWithdrawal {
    private static final int CORRECT_PIN = 1234;
    private static double balance = 1000.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your PIN: ");
            int enteredPin = scanner.nextInt();

            if (enteredPin != CORRECT_PIN) {
                throw new IllegalArgumentException("Invalid PIN. Please try again.");
            }

            System.out.print("Enter amount to withdraw: ");
            double amount = scanner.nextDouble();

            // Check if sufficient balance
            if (amount > balance) {
                throw new IllegalArgumentException("Insufficient balance.");
            }

            // Process withdrawal
            balance -= amount;
            System.out.println("Withdrawal successful.");
            System.out.println("Remaining balance: " + balance);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Remaining balance: " + balance);
        } catch (Exception e) {
            System.out.println("Error: Invalid input.");
            System.out.println("Remaining balance: " + balance);
        } finally {
            // Close scanner
            scanner.close();
        }
    }
}
