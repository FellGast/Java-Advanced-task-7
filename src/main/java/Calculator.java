import Operations.*;
import java.util.HashMap;
import java.util.Map;

public class Calculator {
    private char operation;
    private double operand1;
    private double operand2;

    private double result;
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
        try {
            operationMapValue = operationMap.get(operation);
            this.setResult(operationMapValue.calculateResult(operand1, operand2)) ;
            return this.getResult();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public char getOperation() {
        return operation;
    }

    public void setOperation(char operator) {
        if (operator != '+' & operator != '-' & operator != '*' & operator != '/') {
            throw new RuntimeException("Нет такой операции");
        }
        this.operation = operator;
    }

    public double getOperand1() {
        return operand1;
    }

    public void setOperand1(double operand1) {
        this.operand1 = operand1;
    }

    public double getOperand2() {
        return operand2;
    }

    public void setOperand2(double operand2) {
        this.operand2 = operand2;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {this.result = result;}
}