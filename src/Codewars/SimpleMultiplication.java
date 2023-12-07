package Codewars;

public class SimpleMultiplication {
/*
This kata is about multiplying a given number by eight if
it is an even number and by nine otherwise.
 */
    public static void main(String[] args) {

       int multiply = SimpleMultiplication.simpleMultiplication(9);

       System.out.println(multiply);  System.out.println();
    }

    public static int simpleMultiplication(int n) {
        return n * (n % 2 == 0 ? 8 : 9);
//        final int multiply;
//        //your code here
//        if( n % 2 == 0 ){
//            multiply = n * 8;
//
//        } else {
//            multiply = n * 9;
//        }
//
//        return multiply;
    }
}
