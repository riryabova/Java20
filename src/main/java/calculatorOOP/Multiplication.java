package calculatorOOP;

public class Multiplication extends Operation {
    public Multiplication(double num1, double num2) {
        super(num1, num2);
    }

    public double opMultiplication(Multiplication mult) {
        double result = mult.getNum1() * mult.getNum2();
        return result;
    }
}
