package Codewars;

public class CompareStrings {

    public static void main(String[] args) {
        String a = "text";

        StringBuilder b = new StringBuilder(a);

//        if ( a == b) {
//            System.out.println("1");
//

//        } else {
//            System.out.println("do not compare");
//            System.out.println( a + " " + b);
//        }
        if( b.toString().equals(a))
            System.out.println("2");
    }


}
