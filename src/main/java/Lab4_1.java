public class Lab4_1 {
    /**
     * Массив размерностью 20, заполняется случайными целыми числами от -10 до 10.
     * Найти максимальный отрицательный и минимальный положительный элементы массива.
     * Поменять их местами.
     */
    public static void main(String[] args) {
        int num = 20;
        int a = -10; // Начальное значение диапазона - "от"
        int b = 10; // Конечное значение диапазона - "до"

        int mas[] = new int[num];
        for (int i = 0; i < num; i++) {
            mas[i] = (int) (Math.random() * (20 + 1)) - 10;
        }
        System.out.println("Array before:");
        for (int j = 0; j < num; j++) {
            System.out.println(j + " element = " + mas[j]);
        }

        int maxNeg = 0;
        int maxNegNum = 0;
        int minPosit = 11;
        int minPositNum = 0;

        for (int z = 0; z < num; z++) {
            if (mas[z] < 0 && maxNeg > mas[z]) {
                maxNeg = mas[z];
                maxNegNum = z;
            }
            if (mas[z] > 0 && minPosit > mas[z]) {
                minPosit = mas[z];
                minPositNum = z;
            }
        }

        if (maxNeg == 0) {
            System.out.println("Отрицательных значений нет");
        } else System.out.println("Max negative =" + maxNeg);
        if (minPosit == 11) {
            System.out.println("Положительных значений нет");
        } else System.out.println("Min positive =" + minPosit);

        int o=mas[maxNegNum];
        mas[maxNegNum]=mas[minPositNum];
        mas[minPositNum]=o;

        System.out.println("\n Array after:");
        for (int j = 0; j < num; j++) {
            System.out.println(j + " element = " + mas[j]);
        }

    }
}
