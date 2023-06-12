package com.pluralsight.calcengine;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringVal {

    public static void main(StringVal[] args) {
        int iVal = 100;
        String sVal = String.valueOf(iVal);

        int i = 2, j = 3;
        int result = i * j;
        String output = i + " * " + j + " = " + result ;

        // String Builder
        String location = "Florida";
        int flightNumber = 175;
        StringBuilder sb = new StringBuilder(40);
        sb.append("I flew to ");
        sb.append(location);
        sb.append(" on Flight #");
        sb.append(flightNumber);
        String message = sb.toString();

        String time = "9:00";
        int pos = sb.indexOf(" on");
        sb.insert(pos, " at ");
        sb.insert(pos + 4, time);
        message = sb.toString();
        System.out.println(message);

        int david = 17, dawson = 15, dillon = 8, gordon = 6;
        // constract a string "My nephews are 17, 15, 8, and 6 years old."
        String s1 = "My nephews are " + david + ", " + dawson + ", "
                + dillon + ", and " + gordon + " years old.";

        String s2 = String.format(
                "My nephews are %d, %d, %d, and %d years old.",
                david, dawson, dillon, gordon
                );
        double avgDiff = ((david - dawson) + (dawson + dillon) + (dillon - gordon)) / 3.0d;
        String s3 =
                "The average age betweeb each is " + avgDiff + " years";

        String s4 = String.format(
                "The average age between each is %.1f years", avgDiff
        );

        int iVal56 = 32;
        String s101 = String.format("%d", iVal56); //32
        String s20 = String.format("%x", iVal56); //20
        String s30 = String.format("%#x", iVal56); //0x20
        String s40 = String.format("%#X", iVal56); //0X20

        int w = 5, x = 235, y = 481, z = 12;

        s1 = String.format("W:%d X:%d", w, x); // W:5 X:235
        s1 = String.format("Y:%d Z:%d", y, z); // Y:481 Z:12

        s3 = String.format("W:%4d X:%4d", w, x); // W:   5 X: 235
        s4 = String.format("Y:%4d Z:%4d", y, z); // Y: 481 Z:  12

        String s5 = String.format("W:%04d Z:%04d", w, x); // W:0005 X:0235
        String s6 = String.format("Y:%04d Z:%04d", y, z); // Y:0481 Z:0012

        String s7 = String.format("W:%-4d Z:%-4d", w, x); // W:5   X:235
        String s8 = String.format("Y:%-4d Z:%-4d", y, z); // Y:481 Z:12

        int iVal1 = 1234567;

        String s9 = String.format("%d", iVal1); //1234567
        String s10 = String.format("%,d", iVal1);// 1,234,567
        String s11 = String.format("%,.2f", iVal1); // 1,234,567.00

        int iPosVal = 123, iNegVal = -456;

        String s12 = String.format("%d", iPosVal); // 123
        String s13 = String.format("%d", iNegVal); // -456

        String s14 = String.format("% d", iPosVal); //  123
        String s15 = String.format("% d", iNegVal); // -456

        String s16 = String.format("%+d", iPosVal); // +123
        String s17 = String.format("%+d", iNegVal); // -456

        String s19 = String.format("%(d", iPosVal);  // 123
        String s201 = String.format("%(d", iNegVal); // (456)
        String s21 = String.format("% (d", iPosVal); //  123

        int valA = 100, valB = 200, valC = 300;

        String s22 = String.format("%d %d %d", valA, valB, valC); //100 200 300
        String s23 = String.format("%3$d %1$d %2$d", valA, valB, valC); //300 100 200

        String s24 = String.format("%2$d %<d %1$d", valA, valB, valC); // 200 200 100

        LocalDate today = LocalDate.now();
        System.out.println(today);



        String usDateString = "07-04-2022";
        //LocalDate failedDate = LocalDate.parse(usDateString);
        DateTimeFormatter usDateFormat = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        System.out.println(today.format(usDateFormat));


    }

}
