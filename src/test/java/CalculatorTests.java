

import calculatorOOP.Addition;
import calculatorOOP.Division;
import calculatorOOP.Multiplication;
import calculatorOOP.Subtraction;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Задание №8
 * Покрыть Unit тестами последний проект с калькулятором
 */
public class CalculatorTests {
    @Test
    public void positiveIntAddTest() {
        double num1 = 1;
        double num2 = 2;

        Addition add = new Addition(num1, num2);
        double res = add.opAddition(add);
        Assert.assertEquals(3.0, res, 0);
    }

    @Test
    public void negativeIntAddTest() {
        double num1 = -10;
        double num2 = -2;

        Addition add = new Addition(num1, num2);
        double res = add.opAddition(add);
        Assert.assertEquals(-12.0, res, 0);
    }

    @Test
    public void positiveNotIntAddTest() {
        double num1 = 1.5;
        double num2 = 2.1;

        Addition add = new Addition(num1, num2);
        double res = add.opAddition(add);
        Assert.assertEquals(3.6, res, 0.1);
    }

    @Test
    public void negativeNotIntAddTest() {
        double num1 = -10.3;
        double num2 = -2.9;

        Addition add = new Addition(num1, num2);
        double res = add.opAddition(add);
        Assert.assertEquals(-13.2, res, 0.1);
    }

    @Test
    public void positiveIntSubTest() {
        double num1 = 11;
        double num2 = 2;

        Subtraction sub = new Subtraction(num1, num2);
        double res = sub.opSubtraction(sub);
        Assert.assertEquals(9.0, res, 0);
    }

    @Test
    public void negativeIntSubTest() {
        double num1 = -10;
        double num2 = -2;

        Subtraction sub = new Subtraction(num1, num2);
        double res = sub.opSubtraction(sub);
        Assert.assertEquals(-8.0, res, 0);
    }

    @Test
    public void positiveNotIntSubTest() {
        double num1 = 1.5;
        double num2 = 2.1;

        Subtraction sub = new Subtraction(num1, num2);
        double res = sub.opSubtraction(sub);
        Assert.assertEquals(-0.6, res, 0.1);
    }

    @Test
    public void negativeNotIntSubTest() {
        double num1 = -101.3;
        double num2 = -2.9;

        Subtraction sub = new Subtraction(num1, num2);
        double res = sub.opSubtraction(sub);
        Assert.assertEquals(-98.4, res, 0.1);
    }

    @Test
    public void positiveIntMulTest() {
        double num1 = 11;
        double num2 = 2;

        Multiplication mul = new Multiplication(num1, num2);
        double res = mul.opMultiplication(mul);
        Assert.assertEquals(22.0, res, 0);
    }

    @Test
    public void negativeIntMulTest() {
        double num1 = -10;
        double num2 = -2;

        Multiplication mul = new Multiplication(num1, num2);
        double res = mul.opMultiplication(mul);
        Assert.assertEquals(20.0, res, 0);
    }

    @Test
    public void positiveNotIntMulTest() {
        double num1 = 1.5;
        double num2 = 2.1;

        Multiplication mul = new Multiplication(num1, num2);
        double res = mul.opMultiplication(mul);
        Assert.assertEquals(3.15, res, 0.1);
    }

    @Test
    public void negativeNotIntMulTest() {
        double num1 = -101.3;
        double num2 = -2.9;

        Multiplication mul = new Multiplication(num1, num2);
        double res = mul.opMultiplication(mul);
        Assert.assertEquals(293.77, res, 0.1);
    }


    @Test
    public void positiveIntDivTest() {
        double num1 = 90;
        double num2 = 2;

        Division division = new Division(num1, num2);
        double res = division.opDivision(division);
        Assert.assertEquals(45.0, res, 0);
    }

    @Test
    public void negativeIntDivTest() {
        double num1 = -10;
        double num2 = -2;

        Division division = new Division(num1, num2);
        double res = division.opDivision(division);
        Assert.assertEquals(5.0, res, 0);
    }

    @Test
    public void positiveNotIntDivTest() {
        double num1 = 1.5;
        double num2 = 2.1;

        Division division = new Division(num1, num2);
        double res = division.opDivision(division);
        Assert.assertEquals(0.714, res, 0.1);
    }

    @Test
    public void negativeNotIntDivTest() {
        double num1 = -101.3;
        double num2 = 2.9;

        Division division = new Division(num1, num2);
        double res = division.opDivision(division);
        Assert.assertEquals(-34.93, res, 0.1);
    }

}
