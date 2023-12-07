package JavaWithSerg;

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println("Task #1");
       /*
       Задача №1
Необходимо создать целочисленные переменные a и b, присвоить произвольные
значения переменным на ваш выбор и вывести результаты следующих операций
с этими переменными: сложение, умножение, вычитание, деление.
         */

        int a = 10;
        int b = 20;

        System.out.println("Sum: " + (a + b));
        System.out.println("Multiplication: " + a*b);
        System.out.println("Substraction: " + (b-a));
        System.out.println("Division: " + a/b);

        System.out.println();
        System.out.println("Task #2");
        /*
        Экстра задача
Также вывести остаток от деления и сделать проверку на четность этих переменных.
         */

        double reminder = (double)a/b;
        System.out.println("Reminder: " + reminder);
        if( a%2 != 0 ){
            System.out.println("a is not even");
        } else {
            System.out.println("a is even");
        }

        if( b%2 != 0){
            System.out.println("b is not even");
        } else {
            System.out.println("b is even");
        }

        System.out.println();
        System.out.println("Task #3");
        /*
        Экстра задача
Вывести/напечатать смайлик (не :), а настоящий смайлик одним символом).
         */

        System.out.print("\u263A");

    }

}
