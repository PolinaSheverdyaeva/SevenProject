package homeWorkIrina;

public class HomeWork3 {

    public static void main(String[] args) {
        /* #2 Создать переменные a и b типа byte, присвоить им значения из допустимого диапазона.*/
        System.out.println();
        System.out.println("task #2");

        byte a1;
        byte b2;

        a1 = Byte.MIN_VALUE;
        b2 = Byte.MAX_VALUE;

        System.out.println(a1);
        System.out.println(b2);
        System.out.println();




     /* #9 Создать переменные sum, product, quotient и remainder,
                 и  присвоить им значения вычислений переменных f и d */
        System.out.println("task #9");

        float f = 100.101101F;
        double d = 100.101101;

        int a = 9;
        int b = 2;


        double sum = f + d;
        double product = f * d;
        double quotient = f / d;
        double remainder = f % d;
        int remainder1 = a % b;

        System.out.println("sum of f and d :" + sum);
        System.out.println("product of f and d :" + product);
        System.out.println("quotient of f and d :" + quotient);
        System.out.println("remainder of f and d :" + remainder);
        System.out.println("remainder of a and b :" + remainder1);
        System.out.println();

        /* #12 С помощью полей классов ссылочного типа распечатать таблицу: */

        System.out.println("task #12");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.printf("%10s %20s %20s %20s", "TYPE", "SIZE IN BITS", "MIN", "MAX");
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------");

        System.out.format("%10s %20s %20d %20d\n",
                Byte.class.getSimpleName(), Byte.SIZE, Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.println("-----------------------------------------------------------------------------");
        System.out.format("%10s %20s %20d %20d\n",
                Short.class.getSimpleName(), Short.SIZE, Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.println("-----------------------------------------------------------------------------");
        System.out.format("%10s %20s %20d %20d\n",
                Integer.class.getSimpleName(), Integer.SIZE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.println("-----------------------------------------------------------------------------");
        System.out.format("%10s %20s %20d %20d\n",
                Long.class.getSimpleName(), Long.SIZE, Long.MIN_VALUE, Long.MAX_VALUE);
        System.out.println("-----------------------------------------------------------------------------");
        System.out.format("%10s %20s %20f %20e\n",
                Float.class.getSimpleName(), Float.SIZE, Float.MIN_VALUE, Float.MAX_VALUE);
        System.out.println("-----------------------------------------------------------------------------");
        System.out.format("%10s %20s %20f %20e\n",
                Double.class.getSimpleName(), Double.SIZE, Double.MIN_VALUE, Double.MAX_VALUE);
        System.out.println("-----------------------------------------------------------------------------");


        /* #13. Создать 2 переменные референсного типа Integer - num1 и num2, присвоить им одинаковые значения,
        сравнить 2 переменные друг с другом с помощью метода .equal. Вывести результат сравнения на печать
        в виде выражения:
        “Если num1 = num2, то результат сравнения методом .equal = …”
        Присвоить переменным разные значения, сравнить,  и вывести результат на печать:
        “Если num1 не равно num2, то результат сравнения методом .equal = …” */

        System.out.println();

        System.out.println("task #13");
        Integer num1 = 10;
        Integer num2 = 10;

        System.out.println("Если num1 = num2, то результат сравнения методом .equal = " + num1.equals(num2));

        num2 = 20;

        System.out.println("Если num1 не равно num2, то результат сравнения методом .equal = " + num1.equals(num2));

        /* #14. Создать 2 переменные референсного типа Integer - num1 и num2, присвоить им одинаковые значения,
        сравнить 2 переменные друг с другом с помощью метода .equal. Вывести результат сравнения на печать
        в виде выражения:
        “Если num1 = num2, то результат сравнения методом .equal = …”
        Присвоить переменным разные значения, сравнить,  и вывести результат на печать:
        “Если num1 не равно num2, то результат сравнения методом .equal = …” */

        System.out.println();
        System.out.println("task #14");

        int number1;
        int number2;

        System.out.println("а) number1 = number2");
        number1 = 5;
        number2 = 5;

        System.out.println("Если number1 = number2, то результат сравнения методом .compareTo = " + " "
                + Integer.valueOf(number1).compareTo(Integer.valueOf(number2)));
        System.out.println();

        System.out.println("b) number1 < number2");
        number1 = 5;
        number2 = 10;

        System.out.println("Если number1 > number2, то результат сравнения методом .compareTo = " + " "
                + Integer.valueOf(number1).compareTo(Integer.valueOf(number2)));
        System.out.println();

        System.out.println("b) number1 > number2");
        number1 = 10;
        number2 = 5;

        System.out.println("Если number1 < number2, то результат сравнения методом .compareTo = " + " "
                + Integer.valueOf(number1).compareTo(Integer.valueOf(number2)));
        System.out.println();


        /* 22.	Создать переменную Integer numberInteger = 100.
                Доказать, что numberInteger имеет тип Integer,
                    а numberInteger.toString() имеет тип String. */

        System.out.println();
        System.out.println("task #22");

        Integer numberInteger = 100;

        System.out.println(numberInteger.getClass().getTypeName());
        //assert (numberInteger.getClass().equals(Integer.class);
        System.out.println("equalsinteger? " + numberInteger.getClass().equals(Integer.class));

        System.out.println(numberInteger.toString().getClass().getTypeName());


       /* 23.	Вывести на экран следующие выражения, используя для печати только переменные:
        “36.6 градусов по Цельсию  = … градусов по Фаренгейту”, где значение по Фаренгейту.

        должно быть вычислено по формуле "50 kilogram = … lbs,  50 lb = … kg”, где значения должны быть вычислены
        по формулам  */

        System.out.println();
        System.out.println("task #23");

        float tempC = 36.6F;
        float tempF = tempC * 1.8F + 32;

        System.out.printf("%.1f градусов по Цельсию = %.1f градусов по Фаренгейту.", tempC, tempF);

        System.out.println();

        float weightKg = 50F;
        float weightLb = weightKg / 0.45359237F;
        float weightLb1 = 50F;
        float weightKg1 = weightLb1 * 0.45359237F;

        System.out.printf("%.0f kilogram = %.3f lbs, %.0f lb = %.3f kg", weightKg, weightLb, weightLb1, weightKg1);


    }
}
