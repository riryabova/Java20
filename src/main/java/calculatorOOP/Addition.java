package calculatorOOP;

public class Addition extends Operation {

    public Addition(double num1, double num2) {
        super(num1, num2);
    }
    public double opAddition(Addition add) {
        double result = add.getNum1() + add.getNum2();
        return result;
    }
}
