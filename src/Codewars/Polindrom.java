package Codewars;

public class Polindrom {

    public static void main(String[] args) {
        System.out.println(new Polindrom().isPalindrome(121));
    }
//        public boolean isPalindrome(int x) {
//

//            Integer y = x;
//            String a = y.toString();
//
//            StringBuilder reversed = new StringBuilder(a).reverse();
//
//            if( a.equalsIgnoreCase(reversed.toString())){
//                return true;
//            } else {
//                return false;
//            }
//
//        }

    public boolean isPalindrome(int x) {
            if( x < 0){
                return false;
            }
            int y = 0;
            int z = x;
            while (x!=0){
                y = y * 10 + x % 10;
                x=x/10;
            }
            return y==z;
        }

}
