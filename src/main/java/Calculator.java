import Operations.*;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;

public class Calculator {
    private char operation;
    private double operand1;
    private double operand2;
    private Map<Character, Operation> operationMap = new HashMap<>();

    public Calculator() {
        operationMap.put('+', new Addition());
        operationMap.put('-', new Subtraction());
        operationMap.put('*', new Multiplication());
        operationMap.put('/', new Division());
    }
    public Calculator(double operand1, double operand2, char operation) {
        this.setOperand1(operand1);
        this.setOperand2(operand2);
        this.setOperation(operation);

        operationMap.put('+', new Addition());
        operationMap.put('-', new Subtraction());
        operationMap.put('*', new Multiplication());
        operationMap.put('/', new Division());
    }

    public double makeCalculation() {
        Operation operationMapValue = null;
        if (operationMap.containsKey(operation)) {
            operationMapValue = operationMap.get(operation);
        } else {
            System.out.println("Нет такого символа");
        }
        try {
            return operationMapValue.calculateResult(operand1, operand2);
        } catch (Exception e) {
            throw new RuntimeException("Операция не выполнена");
        }
    }

    public char getOperation() {
        return operation;
    }

    public void setOperation(char operator) {
        try {
            if (operator != '+' & operator != '-' & operator != '*' & operator != '/') {
                throw new InputMismatchException();
            }
            this.operation = operator;
        } catch (InputMismatchException ime) {
            System.out.println("Некорректная операция");}

    }

    public double getOperand1() {
        return operand1;
    }

    public void setOperand1(double operand1) {
        try {
            this.operand1 = operand1;
        } catch (InputMismatchException ime) {
            System.out.println("некорректный ввод");}
    }

    public double getOperand2() {
        return operand2;
    }

    public void setOperand2(double operand2) {
        try {
            this.operand2 = operand2;
        } catch (InputMismatchException ime) {
            System.out.println("некорректный ввод");}
    }
}