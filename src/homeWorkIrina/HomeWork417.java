package homeWorkIrina;

public class HomeWork417 {

    /*
    17.	Напишите метод, который примет на вход параметр температуры в Цельсиях,
    и распечатает результат температуры в Цельсиях и в Фаренгейтах.
     */

    public static void temp(float c){
        System.out.println(c + " Celsius");
        System.out.println((c * 1.8F + 32) + " Fahrenheits");
    }

    public static void main(String[] args) {

        float tempC = 40.0F;

        temp(tempC);
    }
}
