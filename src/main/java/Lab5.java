import calculatorOOP.Addition;
import calculatorOOP.Division;
import calculatorOOP.Multiplication;
import calculatorOOP.Subtraction;
import com.sun.source.tree.TryTree;

import java.util.Scanner;
//Задание №5:
//Реализовать калькулятор в стиле ООП. Архитектуру приложения продумать самостоятельно.

public class Lab5 {
    public static void main(String[] args) {
        System.out.println("Calculator");
        double num1 = calcInputNumber();
        double num2 = calcInputNumber();
        operation(num1, num2);
    }

    public static double calcInputNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input number");
        double num = scanner.nextDouble();
        return (num);

    }

    public static void operation(double num1, double num2) {
        Scanner scanner = new Scanner(System.in);

        int y = 0;
        String s = "";

        while (!"5".equals(s)) {
            System.out.println("\n" + "For + enter 1");
            System.out.println("For - enter 2");
            System.out.println("For / enter 3");
            System.out.println("For * enter 4");
            System.out.println("For exit enter 5");
            s = scanner.next();

            try {
                y = Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.println("Incorrect input");
            }

            switch (y) {
                case 1:
                    //Сложение
                    try {
                        Addition add = new Addition(num1, num2);
                        System.out.println("Result = " + add.opAddition(add));
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    // вычитание
                    try {
                        Subtraction sub = new Subtraction(num1, num2);
                        System.out.println("Result = " + sub.opSubtraction(sub));
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    // деление
                    try {
                        Division division = new Division(num1, num2);
                        System.out.println("Result = " + division.opDivision(division));
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    // умножение
                    try {
                        Multiplication mult = new Multiplication(num1, num2);
                        System.out.println("Result = " + mult.opMultiplication(mult));
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
            }
        }
        scanner.close();
        return;
    }

}
