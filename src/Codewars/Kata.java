package Codewars;

public class Kata {
    /*
    Complete the solution so that it returns true if the first argument(string) passed in ends with the 2nd argument (also a string).
     */

    public static void main(String[] args) {
        boolean res = Kata.solution("Privet Deniska Sosiska!", "ka!");
        System.out.println(res);
    }

        public static boolean solution(String str, String ending) {

            return str.endsWith(ending);
        }

}
