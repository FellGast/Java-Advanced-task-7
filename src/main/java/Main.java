package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main( String[] args ) {
        System.out.println("Write two numbers and +, -, * or / sign");
        char operator = 0;
        double firstNum = 0;
        double secondNum = 0;
        try {
            firstNum = scanner.nextDouble();
            secondNum = scanner.nextDouble();
            operator = scanner.next().charAt(0);
        } catch (InputMismatchException ime) {
            System.out.println("invalid input");
        } finally {
            if (operator != '+' & operator != '-' & operator != '*' & operator != '/') {
                throw new InputMismatchException();
            }
            Calculator calculator = new Calculator(firstNum, secondNum,    operator);
            System.out.println(calculator.makeCalculation());
        }
    }
}
