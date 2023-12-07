package Codewars;

public class LuckyNumber {

        public static boolean isLucky(long n) {

            if ( n == 0 || n % 9 == 0){
                return true;
            } else {
                return false;
            }
        }
    }
