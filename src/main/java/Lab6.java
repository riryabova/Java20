import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Lab6 {
    /**
     * Есть входной файл с набором слов, написанных через пробел
     * Необходимо:
     * Прочитать слова из файла.
     * Отсортировать в алфавитном порядке. +
     * Посчитать сколько раз каждое слово встречается в файле.       Вывести статистику на консоль +
     * Найти слово с максимальным количеством повторений. Вывести на консоль это слово и сколько раз оно встречается в файле
     */

    public static void main(String[] args) throws IOException {

        String fileName = "src/main/resources/lab6.txt";
        ArrayList<String> arrayList = readFile(fileName);

        arrayList = sortWords(arrayList);
        System.out.println("Отсортированный лист " + arrayList);

        freqOfWord(arrayList);
        maxFreqOfWord(arrayList);

    }

    public static void maxFreqOfWord(ArrayList<String> arrayList) {
        int i = 1;
        String temp = "";
        for (String str : arrayList) {
            int t = Collections.frequency(arrayList, str);
            if (t > i) {
                i = t;
                temp = str;
            }
        }
        System.out.println("Слово с максимальным количеством повторений:");
        System.out.println("слово " + temp + ", кол-во раз " + i);
    }

    public static void freqOfWord(ArrayList<String> arrayList) {
        System.out.println("Сколько раз каждое слово встречается в файле:");
        Set<String> hSet = new HashSet<>(); //хэш сет для того чтобы не печатать повторно слова, которые встерчаются больше одного раза
        for (String str : arrayList) {
            if (hSet.add(str)) // Если уже есть то не идем печатать опять
                System.out.println("слово " + str + ", кол-во раз " + Collections.frequency(arrayList, str));
        }
    }

    public static ArrayList<String> sortWords(ArrayList<String> arrayList) {
        String temp;

        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = i + 1; j < arrayList.size(); j++) {
                if (arrayList.get(i).compareTo(arrayList.get(j)) > 0) {
                    temp = arrayList.get(i);
                    arrayList.set(i, arrayList.get(j));
                    arrayList.set(j, temp);
                }
            }
        }
        return arrayList;
    }


    public static ArrayList<String> readFile(String fileName) throws IOException {
        ArrayList<String> arrayList = new ArrayList<String>();
        FileReader fr = new FileReader(fileName);
        StringBuffer sBuffer = new StringBuffer();
        while (fr.ready()) {
            char c = (char) fr.read();
            if (c == ' ') {
                arrayList.add(sBuffer.toString());
                sBuffer = new StringBuffer();
            } else {
                sBuffer.append(c);
            }
        }
        if (sBuffer.length() > 0) {
            arrayList.add(sBuffer.toString());
        }
        return arrayList;
    }

}
