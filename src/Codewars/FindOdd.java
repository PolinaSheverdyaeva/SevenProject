package Codewars;


import java.util.Arrays;

public class FindOdd {

    /*
    Given an array of integers, find the one that appears an odd number of times.

There will always be only one integer that appears an odd number of times.
     */

    public static void main(String[] args) {

        int[] arr = {1, 1, 3, 0, 9, 1, 5};

        int odd = FindOdd.findInt(arr);
        System.out.println(odd);
    }

    public static int findInt(int[] a) {
        int odd = a[0];
        for (int i = 0; i < a.length; i++) {
            odd ^= a[i];
        }
        return odd;
    }
}
