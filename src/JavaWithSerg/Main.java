package JavaWithSerg;

//public class Main {

//    public static void main(String[] args) {
	// write your code here
//        System.out.println("test");
//        System.out.println("Hello world!" + "!");
//        System.out.println();
//        System.out.println(123);
//        System.out.print(123+10);
//
//        System.out.println("Hello world!" + "!");
/*
Sum the even integers from 2 to 20 and store the result in the variable
called total.
 */
        public class Main{
            public static void main( String args[] ){
                int total = 0;

                for (int number = 2; number <= 20; number+=2) {
                    total += number;
                }

                 // total even integers from 2 through 20
                System.out.printf( "Sum is %d\n", total ); // display results
                 } // end main
            } // end class Su




