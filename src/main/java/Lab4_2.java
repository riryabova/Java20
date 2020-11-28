import sweets.Candy;
import sweets.Jellybean;
import sweets.Sweets;
import sweets.Сookie;

public class Lab4_2 {
    /**
     * Формируется новогодний подарок. Он может включать в себя разные сладости (Candy, Jellybean, etc.)
     * У каждой сладости есть название, вес, цена и свой уникальный параметр.
     * Необходимо собрать подарок из сладостей.
     * Найти общий вес подарка, общую стоимость подарка и вывести на консоль информацию о всех сладостях в подарке.
     */
    public static void main(String[] args) {
        Candy candy1 = new Candy("Мишка", 1.2f, 123, "шоколадные");
        Jellybean jellybean1 = new Jellybean("Червяки", 0.5f, 60, "мульти");
        Сookie cookie1 = new Сookie("Овсяные", 1f, 40, "топленое молоко");

        Candy candy2 = new Candy();
        candy2.setType("Ирис");
        candy2.setName("Золотой ключик");
        candy2.setPrice(15);
        candy2.setWeight(0.3f);

        Sweets[] box = {candy1, jellybean1, cookie1, candy2};
        float boxWeight = 0;
        int boxPrice = 0;

        for (Sweets someSweets : box) {
            System.out.println(someSweets.toString());
            boxWeight = boxWeight + someSweets.getWeight();
            boxPrice = boxPrice + someSweets.getPrice();
        }
        System.out.println("Box Weight = " + boxWeight);
        System.out.println("Box Price = " + boxPrice);
    }

}
