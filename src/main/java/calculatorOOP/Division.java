package calculatorOOP;

public class Division extends Operation {
    public Division(double num1, double num2) {
        super(num1, num2);
    }

    public double opDivision(Division division) {
        double result = division.getNum1() / division.getNum2();
        return result;
    }
}
