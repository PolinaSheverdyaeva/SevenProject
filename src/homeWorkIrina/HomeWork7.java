package homeWorkIrina;

import java.util.Arrays;
public class HomeWork7 {

    /*
    Написать метод, который принимает на вход массив int, и возвращает среднее значение.
    Проверить работу метода тестом, если параметр - массив catsAges
     */

    public static double average(int[] array) {

        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("array");
        }

        int sum = 0;
        for (int i : array) {
            sum += i;

        }
        return ((double) sum) / array.length;
    }

    public static void main(String[] args) {

        int a = 2;
        int[] array = {a, 4, 6, 8, 10};

        int [] catsAges = {2, 4, 6, 8, 10};

        System.out.println(average(array));
        System.out.println("Cats ages " + average(catsAges));

        int[] newAges = Arrays.copyOf(catsAges, catsAges.length + 1);
        newAges[newAges.length - 1] = 6;
        System.out.println("new ages len " + (newAges.length));
        System.out.println("new ages " + average(newAges));

        java.util.List<Integer> list = (java.util.List<Integer>)Arrays.asList(1,2,3);
        for (Integer item : list) {
            System.out.print(item + " ");
        }

    }

}
