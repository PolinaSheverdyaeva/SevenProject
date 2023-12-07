package homeWorkIrina;

public class HomeWork413 {

     /*
        13. Напишите алгоритм программы, которая проверяет 2 числа. Программа
        складывает числа, которые делятся на 3 без остатка, и вычитает числа,
        которые делятся на 5 без остатка. Программа умножает числа, которые
        делятся на 2 без остатка, но если хотя бы одно число отрицательное,
        программа умножает результат предыдущего действия на (-1).
        Если числа не прошли ни одну проверку, программа выводит на печать ошибку
        о невозможности произвести действия.
               */

    public static int returnPositiveNumber(int num) {

        if (num < 0) {
            num = (-1) * num;
        }
        return num;
    }

    public static void main(String[] args) {

        int x = -3;
        int y = 5;

        if (x % 3 == 0 && y % 3 == 0) {

            int result = x + y;
            returnPositiveNumber(result);
            System.out.println("сумма x и y: " + result);
        } else {
            if (x % 5 == 0 && y % 5 == 0) {
                int result = x - y;
                returnPositiveNumber(result);
                System.out.println("разность х и у: " + result);
            } else {
                if (x % 2 == 0 && y % 2 == 0) {
                    int result = x * y;
                    returnPositiveNumber(result);
                    System.out.println("Произведение х и у: " + result);
                } else {
                    System.out.println("Error");
                }
            }
        }
    }
}
