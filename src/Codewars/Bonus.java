package Codewars;

public class Bonus {
    public static void main(String[] args) {
        System.out.println(bonusTime(10000, true));

    }
        public static String bonusTime(final int salary, final boolean bonus) {

            return (bonus == true) ? "\u00A3" + salary * 10 : "\u00A3" + salary;
        }


}
