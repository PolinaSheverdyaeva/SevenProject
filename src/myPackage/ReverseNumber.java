package myPackage;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = sc.nextInt();

        //1. Using an algorithm

//        int rev = 0;
//        while(num != 0){
//            rev = rev * 10 + num % 10;
//            num = num/10;
//        }
//
//        System.out.println("Reverse Number is: " + rev);

        //2. Using StringBuffer class method

//        StringBuffer sb = new StringBuffer(String.valueOf(num)); //convert our number into string
//        StringBuffer rev = sb.reverse();
//
//        System.out.println("Reverse Numbaer is: " + rev);

        //3. Using StringBuilder class method

        //StringBuilder sbl = new StringBuilder(String.valueOf(num));

        StringBuilder sbl = new StringBuilder();
        sbl.append(num); //append our number - int to the variable as a string

       StringBuilder rev = sbl.reverse();

        System.out.println("Reverse Number is: " + rev);


    }
}
