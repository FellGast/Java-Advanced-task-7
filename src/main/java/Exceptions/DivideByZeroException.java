package Exceptions;

public class DivideByZeroException extends RuntimeException {
    public DivideByZeroException() {
        super("Попытка деления на ноль");
    }
}
