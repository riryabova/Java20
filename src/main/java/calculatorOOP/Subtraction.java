package calculatorOOP;

public class Subtraction extends Operation {
    public Subtraction(double num1, double num2) {
        super(num1, num2);
    }

    public double opSubtraction(Subtraction sub) {
        double result = sub.getNum1() - sub.getNum2();
        return result;
    }
}
