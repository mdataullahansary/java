import java.util.Scanner;

public class calculator {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        double firstNumber = scanner.nextDouble();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        double secondNumber = scanner.nextDouble();

        // Prompt the user to choose an operation
        System.out.println("Choose an operation:");
        System.out.println("1 : + (Addition)");
        System.out.println("2 : - (Subtraction)");
        System.out.println("3 : * (Multiplication)");
        System.out.println("4 : / (Division)");
        System.out.println("5 : % (Modulo or remainder)");
        System.out.print("Enter the operation number: ");
        int operation = scanner.nextInt();

        // Perform the calculation based on the chosen operation
        double result = 0;
        switch (operation) {
            case 1:
                result = firstNumber + secondNumber;
                break;
            case 2:
                result = firstNumber - secondNumber;
                break;
            case 3:
                result = firstNumber * secondNumber;
                break;
            case 4:
                // Check if the second number is not zero to avoid division by zero error
                if (secondNumber != 0) {
                    result = firstNumber / secondNumber;
                } else {
                    System.out.println("Error: Division by zero!");
                    return; // Exit the program
                }
                break;
            case 5:
                result = firstNumber % secondNumber;
                break;
            default:
                System.out.println("Invalid operation!");
                return; // Exit the program
        }

        // Display the result
        System.out.println("Result: " + result);

        // Close the Scanner object to prevent resource leak
        scanner.close();
    }
}

