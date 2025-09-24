import java.util.Scanner;

public class calculator {

    // Methods for operations
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueCalc = true;

        System.out.println("-- Java Console Calculator --");

        while (continueCalc) {
            System.out.print("\nEnter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            System.out.println("Choose operation: ");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.print("Enter choice (1-4): ");
            int choice = sc.nextInt();

            double result = 0;
            switch (choice) {
                case 1:
                    result = add(num1, num2);
                    break;
                case 2:
                    result = subtract(num1, num2);
                    break;
                case 3:
                    result = multiply(num1, num2);
                    break;
                case 4:
                    result = divide(num1, num2);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

            System.out.println("Result = " + result);

            System.out.print("\nDo you want to perform another calculation? (y/n): ");
            char again = sc.next().charAt(0);
            if (again == 'n' || again == 'N') {
                continueCalc = false;
                System.out.println("Exiting Calculator. Goodbye!");
            }
        }

        sc.close();
    }
}
