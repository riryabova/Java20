import java.util.Scanner;

public class Base {
    static final int currentNumber = 6;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = 0;
        String s = "";

        System.out.println("\n" + "For calculator enter 1");
        System.out.println("For array enter 2");
        System.out.println("For exit enter 3");
        s = scanner.next();

        switch (s) {
            case "1":
                calculate();
                break;
            case "2":
                longestElementInArray();
                break;
            default:
                System.out.println("Incorrect input");
        }
        scanner.close();
    }

    /**
     * Калькулятор
     */
    public static void calculate() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input first number");
        float i = scanner.nextFloat();
        System.out.println("Input second number");
        float j = scanner.nextFloat();

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
                    //Вызов сложения
                    System.out.printf(i + " + " + j + " = ");
                    System.out.printf("%.4f", i + j);
                    break;
                case 2:
                    // вызов вычитания
                    System.out.printf(i + " - " + j + " = ");
                    System.out.printf("%.4f", i - j);
                    break;
                case 3:
                    // вызов деления
                    System.out.printf(i + " / " + j + " = ");
                    System.out.printf("%.4f", i / j);
                    break;
                case 4:
                    // вызов умножения
                    System.out.printf(i + " * " + j + " = ");
                    System.out.printf("%.4f", i * j);
                    break;
            }
        }
        scanner.close();
    }

    /**
     * Поиск максимального элемента в массиве. Для начала задать массив слов.
     * Размерность массива произвольна, задается в консоли.
     * После чего в консоли вводятся слова в количестве равном заданной длине массива.
     * В полученном массиве необходимо найти самое длинное слово. Результат вывести на консоль
     */
    public static void longestElementInArray() {
        int num = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of elements");
        num = input.nextInt();

        String mas[] = new String[num];
        for (int i = 0; i < num; i++) {
            Scanner masElement = new Scanner(System.in);
            System.out.println("Enter " + i + " element");
            mas[i] = masElement.nextLine();
        }
        System.out.println("Your new array:");
        for (int j = 0; j < num; j++) {
            System.out.println(j + " element = " + mas[j]);
        }

        String word = mas[0];
        for (int z = 0; z < num; z++) {
            if (mas[z].length() > word.length()) {
                word = mas[z];
            }
        }
        System.out.println("Longest word in array " + word);
    }

}
