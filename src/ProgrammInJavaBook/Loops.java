package ProgrammInJavaBook;

public class Loops {

    public static void main(String[] args) {
        System.out.println("Task 1 - 5.3. a");
        /*
        Sum the odd integers between 1 and 99,
        using a for statement. Assume that the integer
variables sum and count have been declared.
         */
        int sum = 2;

        for( int i = 2; i <= 99; i += 2)
            sum += i;
            System.out.println(sum);

        System.out.println("Task 2 - 5.3. b");
/*
Calculate the value of 2.5 raised to the power of 3, using the pow method
 */
        double a = 2.5;
        double pow = 3;
        double result;
        result = Math.pow(a,pow);
        System.out.println(result);

        System.out.println("Task 3 - 5.3. c");
        /*
      Print the integers from 1 to 20, using a while loop and the counter
      variable i. Assume that the variable i has been declared, but not
      initialized. Print only five integers per line. [Hint: Use the
      calculation i % 5. When the value of this expression is 0, print
      a newline character; otherwise, print a tab character. Assume that
      this code is an application. Use the System.out.println() method
      to output the newline character, and use the System.out.print( '\t' )
       method to output the tab character.]
         */

        int i = 1;
        while(i <= 20){
            System.out.print(i);

            if ( i % 5 == 0)
                System.out.println();
             else
                System.out.print('\t');
            ++i;
        }

//        final int once;
//        if (i == 1) once = 1; else once = 2;

        System.out.println("Task 4 - 5.3. d");

        for( int k = 1; k <= 20; ++k){
            System.out.print(k);

            if ( k % 5 == 0)
                System.out.println();
            else
                System.out.print('\t');
        }
    }
}
