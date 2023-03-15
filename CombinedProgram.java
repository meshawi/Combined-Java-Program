import java.util.Random;
import java.util.Scanner;

public class CombinedProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Calculator");
        System.out.println("2. Password Generator");
        System.out.println("3. Currency Converter");

        int choice = scanner.nextInt();

        switch(choice) {
            case 1:
                performCalculator();
                break;
            case 2:
                performPasswordGenerator();
                break;
            case 3:
                performCurrencyConverter();
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }
    }

    public static void performCalculator() {
        double num1, num2, result = 0;
        char operator;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        num2 = scanner.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        operator = scanner.next().charAt(0);

        switch(operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operator!");
                return;
        }

        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }

    public static void performPasswordGenerator() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter password length: ");
        int length = scanner.nextInt();

        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+<>?,./;:'\"[]{}\\|`~";

        Random random = new Random();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            password.append(characters.charAt(random.nextInt(characters.length())));
        }

        System.out.println("Generated password: " + password.toString());
    }

    public static void performCurrencyConverter() {
        final double SAR_TO_EUR = 0.25;
        final double SAR_TO_USD = 0.27;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount in SAR: ");
        float sarAmount = scanner.nextFloat();

        System.out.println("Choose currency to convert to:");
        System.out.println("1. EUR");
        System.out.println("2. USD");

        int choice = scanner.nextInt();

        double convertedAmount = 0;

        switch(choice) {
            case 1:
                convertedAmount = sarAmount * SAR_TO_EUR;
                System.out.println(sarAmount + " SAR = " + convertedAmount + " EUR");
                break;
            case 2:
                convertedAmount = sarAmount * SAR_TO_USD;
                System.out.println(sarAmount + " SAR = " + convertedAmount + " USD");

                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }
    }
}