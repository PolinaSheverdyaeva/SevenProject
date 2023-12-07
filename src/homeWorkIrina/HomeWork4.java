package homeWorkIrina;

public class HomeWork4 {

    /*2.	Написать метод, который будет печатать номер задания перед каждым ответом. Придумайте свой дизайн. */

    static int counter = 3;

    public static void printTask() {

        System.out.println("Task # " + counter++);
    }

    static int number = 1;

    public static void printSubtask() {
        System.out.println("Задача " + number++);
    }

    public static void taskAndPrint() {
        printTask();
        printSubtask();
    }

    public static void main(String[] args) {

        printTask();
        taskAndPrint();


      /* 3.	Записать в виде кода следующие логические выражения:
	1) (2 = 2) И (7 = 7);
2) Не(15 < 3);
3) ("Сосна" = "Дуб") ИЛИ ("Вишня" = "Клён");
4) Не("Сосна" = "Дуб");
5) (Не(15 < 3)) И (10 > 20);
6) ("Глаза даны, чтобы видеть") И ("Под третьим этажом находится второй этаж");
7) (6/2 = 3) ИЛИ (7*5 = 20). */

        // #1
        System.out.println();

        boolean res = (2 == 2) && (7 == 7);

        System.out.println("1. (2==2) && (7==7): " + res);

        // #2

        res = !(15 < 3);
        System.out.println("2. Не(15 < 3): " + res);

        // #3

        String pine = "Сосна";
        String oak = "Дуб";
        String cherry = "Вишня";
        String maple = "Клён";

        Boolean res3;

        res3 = (pine.equals(oak) || (cherry.equals(maple)));
        System.out.println("3. (\"Сосна\" = \"Дуб\") ИЛИ (\"Вишня\" = \"Клён\"): " + res3);

        //#4
        res = (!(pine.equals(oak)));
        System.out.println("4. Не(\"Сосна\" = \"Дуб\"): " + res);

        // #5
        res = (!(15 < 3) && (10 > 20));
        System.out.println("5. (Не(15 < 3)) И (10 > 20): " + res);

        // #6

        //System.out.println(("Глаза даны, чтобы видеть") && ("Под третьим этажом находится второй этаж"));

        int level3 = 3;
        int level2 = 2;
        String eyeFunction = "видеть";
        res = ((eyeFunction.equals("видеть")) && (level3 > level2));

        System.out.println("6. \"Глаза даны, чтобы видеть\") && (\"Под третьим этажом находится второй этаж\"): " + res);


        System.out.println();
        printTask();

        /*4.	Записать в виде кода:
        1) ("В минуте 70 секунд") ИЛИ ("Работающие часы показывают время");
        2) !(28 > 7) И !(300/5 = 60);
        3) ("Телевизор - электрический прибор") И ("Стекло - дерево");
        4) Не((300 < 100))  → ("Жажду можно утолить водой");
        5) (75 < 81) → (88 = 88). */


        System.out.println("Task # 10");
        /*10. Проверьте число на четность. Если число четное, удвойте это число,
        иначе возведите число в квадрат. Выведите результат работы алгоритма на печать.
        Найдите в презентации, какой блок схеме соответствует ваш алгоритм.
         */

        int number = 2;
        if (number % 2 == 0) {
            System.out.println(number * 2);
        } else {
            System.out.println(number * number);
        }

        System.out.println("Task # 11");
        /*
        11. Напишите алгоритм проверки возраста на соответствие условиям (if-else):
        a) Голосовать можно с 18 лет
        b) Машину можно водить с 16 лет
        c) В школу можно идти с 5 лет
         */

        // a
        System.out.println("subtask a");
        int age = 18;

        if (age >= 18) {
            System.out.println("Голосовать можно");
        } else {
            System.out.println("Голосовать нельзя");
        }

        //b
        System.out.println("subtask b");

        if (age >= 16) {
            System.out.println("Можно водить машину");
        } else {
            System.out.println("Водить машину нельзя");
        }

        //с
        System.out.println("subtask с");

        if (age >= 5 || age <= 18) {
            System.out.println("Можно идти в школу");
        } else {
            System.out.println("В школу еще рано");
        }


    }
}
