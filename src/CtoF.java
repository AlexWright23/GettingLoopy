import java.util.Scanner;

public class CtoF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean validInput = false;

        do {
            System.out.print("Please enter the temperature in Celsius: ");
            if (scanner.hasNextDouble()) {
                double celsius = scanner.nextDouble();
                double fahrenheit = (celsius * 9/5) + 32;
                System.out.println("The temperature in fahrenheit is: " + fahrenheit);
                validInput = true;
            } else {
                System.out.println("Invalid input! Please enter a valid number!");
                scanner.nextLine();
            }
        } while (!validInput);

        scanner.close();
    }
}


