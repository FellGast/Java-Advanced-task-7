import static org.junit.Assert.assertEquals;
import Operations.*;
import org.junit.Test;

/**
 * Unit test for Calculator operations.
 */
public class CalculationTest {

    @Test
    public void testAddition() {

        Operation addition = new Addition();  // Класс Addition реализует интерфейс Operation
        Calculator calc = new Calculator();

        try {
            assertEquals("Ошибка подсчета!", 5, addition.calculateResult(2, 3), 0.001); // Приблизительное сравнение дробных чисел с плавающей точкой

            calc.setOperand1(2);
            calc.setOperand2(3);
            calc.setOperation('+');

            assertEquals("Ошибка подсчета!", 5,  calc.makeCalculation(), 0.001); // Приблизительное сравнение дробных чисел с плавающей точкой

            assertEquals("Ошибка подсчета!", addition.calculateResult(2, 3),  calc.makeCalculation(), 0.001); // Приблизительное сравнение дробных чисел с плавающей точкой
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testSubtraction() {
        Operation subtraction = new Subtraction();  // Класс Subtraction реализует интерфейс Operation
        Calculator calc = new Calculator();
        try {
            assertEquals("Ошибка подсчета!", 4, subtraction.calculateResult(7, 3), 0.001);


            calc.setOperand1(7);
            calc.setOperand2(3);
            calc.setOperation('-');

            assertEquals("Ошибка подсчета!", 4,  calc.makeCalculation(), 0.001);

            assertEquals("Ошибка подсчета!", subtraction.calculateResult(7, 3),  calc.makeCalculation(), 0.001);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testMultiplication() {
        Operation multiplication = new Multiplication();  // Класс Multiplication реализует интерфейс Operation
        Calculator calc = new Calculator();
        try {
            assertEquals("Ошибка подсчета!", 15, multiplication.calculateResult(5, 3), 0.001);

            calc.setOperand1(5);
            calc.setOperand2(3);
            calc.setOperation('*');

            assertEquals("Ошибка подсчета!", 15,  calc.makeCalculation(), 0.001);

            assertEquals("Ошибка подсчета!", multiplication.calculateResult(5, 3),  calc.makeCalculation(), 0.001);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testDivision() {
        Operation division = new Division();  // Класс Division реализует интерфейс Operation
        Calculator calc = new Calculator();
        try {
            assertEquals("Ошибка подсчета!", 4, division.calculateResult(12, 3), 0.001);

            calc.setOperand1(12);
            calc.setOperand2(3);
            calc.setOperation('/');

            assertEquals("Ошибка подсчета!", 4,  calc.makeCalculation(), 0.001);

            assertEquals("Ошибка подсчета!", division.calculateResult(12, 3),  calc.makeCalculation(), 0.001);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
