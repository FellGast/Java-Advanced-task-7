package Operations;

public class Division implements Operation {
    @Override
    public double calculateResult(double left, double right) throws Exception {
        if (right == 0) {
            throw new Exception("На ноль делить нельзя");
        }
        return left / right;

    }
}
