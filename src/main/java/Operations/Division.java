package Operations;

import Exceptions.DivideByZeroException;

public class Division implements Operation {
    @Override
    public double calculateResult(double left, double right) throws DivideByZeroException {
        if (right == 0) {
            throw new DivideByZeroException();
        }
        return left / right;

    }
}
