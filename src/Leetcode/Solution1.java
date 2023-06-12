package Leetcode;

import java.util.Arrays;

public class Solution1 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(twoSum(new int []{2,7,10,12}, 9)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int [] output = new int[2];
        int i = 0;
        int j = 1;

//        while ( i < 5){
//            System.out.println(i);
//            i++;
//        }

        while ( i < nums.length ){
            while ( j < nums.length){
                if ( nums[i] + nums[j] == target ){
                    output [0] = i;
                    output [1] = j;
                }
                j++;

            }
            i++;
        }
        return output;

//        for ( int i = 0; i < nums.length; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//                if ( nums[i] + nums[j] == target ){
//                    output [0] = i;
//                    output [1] = j;
//                }
//            }
//
//        }


    }
}


