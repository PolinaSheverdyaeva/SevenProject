package ProgrammInJavaBook;

import java.util.BitSet;
import java.util.Scanner;

/*
BitSet method size returns the number of bits in a BitSet.
BitSet method 'equals' compares two BitSets for equality.
Two BitSets are equal if and only if each BitSet has identical
values in corresponding bits. BitSet method 'toString' creates
a string representation of a BitSet’s contents.
The Sieve of Eratosthenes (for finding prime numbers), which we
discussed in Exercise 7.27. This example uses a BitSet rather
than an array to implement the algorithm. The application asks
the user to enter an integer between 2 and 1023, displays all
the prime numbers from 2 to 1023 and determines whether that number is prime.
 */
public class BitSetExe {
    public static void main(String[] args) {
        //get input integer
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer from 2 to 1023");
        int input = scanner.nextInt();

        //perform Sieve of Eratosthenes
        BitSet sieve = new BitSet ( 1024 );
        int size = sieve.size();

        //set all bits from 2 to 1023
        for (int i = 2; i < size; i++) {
            sieve.set(i);

            // perform Sieve of Erathospenes
            int finalBit = (int) Math.sqrt( size );

            for (int j = 2; j < finalBit; j++) {
                if ( sieve.get(i) ){
                    for (int k = 2 * i; k < size; k += i) {
                        sieve.clear();
                    }
                }
            }
            int counter = 0;

            //display prime numbers from 2 to 1023
            for (int l = 2; l < size; l++) {
                if ( sieve.get(i) ){
                    System.out.print( String.valueOf(i) );
                    System.out.print( ++counter % 7 == 0 ? "\n" : "\t" );
                }

            }
            // display result
            if ( sieve.get( input ) ){
                System.out.printf("\n%d is a prime number", input);
            } else {
                System.out.printf("\n%d is not a prime number", input);
            }

        }
    }
}
