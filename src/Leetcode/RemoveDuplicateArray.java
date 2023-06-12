package Leetcode;

import java.util.Arrays;

public class RemoveDuplicateArray {

    public static void main(String[] args) {

        System.out.println(removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }

    public static int removeDuplicates(int[] nums) {

        int k = 1;
        if (nums.length == 0) {
            return 0;
        }

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
//            if (i >= k){
//                nums[i]=0;
//            }
        }




            System.out.println(Arrays.toString(nums));
            return k;
        }
    }
