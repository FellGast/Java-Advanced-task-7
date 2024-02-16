import java.util.Scanner;

/**
 * This program realises calculator in OOP
 *
 * @author FellGast
 */

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            System.out.println("Ввести 2 числа и знак операции: (+, -, *, / )");
            Calculator calculator = new Calculator(scanner.nextDouble(), scanner.nextDouble(), scanner.next().charAt(0));

            System.out.println(calculator.makeCalculation());
            scanner.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
