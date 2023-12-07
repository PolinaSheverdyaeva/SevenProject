package JavaWithSerg;



public class HomeWork4 {
    public static void main(String[] args) {

       System.out.println("Task #1");
       /*
       Необходимо вывести числа от 0 до 15.
        */
        for (int i = 0; i < 16; i++) {
            System.out.print(i);
        }

        System.out.println();
        System.out.println("Task #2");
        /*
        Необходимо вывести все положительные степени числа 5 которые меньше 10000, вывести результат возведения в степень
         */

        int b = 5;
        int t = 5;

        while ( t  < 1000){
            System.out.println(t);
            t = t * b;

        }

        System.out.println();
        System.out.println("Task #3");

        /*
        Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.
Реализовать 2 варианта:
●	использовать конструкцию if для определения кратности (цикл с шагом 1, i = i + 1);
●	без использования конструкции if (шаг цикла на ваше усмотрение).
         */

//        int n = 40;

        for(int i = 40; i <= 60; i+=4) {
           // if (i % 4 == 0)
                System.out.println(i);
//             n /= 4;
        }


    }
}
