package JavaWithSerg;

public class HomeWork3 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Task #1");
        /*
        Необходимо создать две целочисленные переменные (a, b),
        присвоить произвольные значения переменным на ваш выбор
        и вывести следующие строки:
●	a == b - если переменные равны
●	a < b - если переменная a меньше b
●	a > b - если переменная b меньше a
         */

        int a = 10;
        int b = 20;
        if( a == b ){
            System.out.println("a == b");
        } else if( a < b ){
                System.out.println("a < b");
            } else if( a > b ) {
            System.out.println("a > b");
        }
            System.out.println();
            System.out.println("Task #2");
            /*
            Задача №2
Необходимо создать две целочисленные переменные (a, b),
присвоить произвольные значения переменным на ваш выбор и
вывести следующие строки:
●	maybe a and b are even - если сумма переменных четная
●	some variable is odd - если сумма переменных нечетная
             */

            if( (a+b)%2 == 0 ){
                System.out.println("maybe a and b are even");
            } else {
                System.out.println("some variable is odd");
            }

        System.out.println();
        System.out.println("Task #3");
        /*
        Задача №3
Необходимо создать целочисленную переменную, присвоить произвольное значение
переменной на ваш выбор и вывести следующие строки:
●	больше 10 - если переменная больше 10
●	меньше 100 - если переменная меньше 100
●	результат деления на 2 больше 20 - если это соответствует истине
●	значение переменной между 5 и 40 включительно - если это правда
●	значение переменной меньше 5 или больше 40 - если предыдущие условие ложное
         */

        int var = 5;

        if( var > 10 ){
            System.out.println("больше 10");
        }
        if( var < 100 ){
            System.out.println("меньше 100");
        }
        if( var/2 > 20 ){
            System.out.println("результат деления на 2 больше 20");
        }
        if( var >= 5 && var <= 40 ){
            System.out.println("значение переменной между 5 и 40 включительно");
        }
        if( var < 5 || var > 40 ){
            System.out.println("значение переменной меньше 5 или больше 40");
        }

    }
}
