package UdemyCoding;

import javax.imageio.stream.ImageInputStream;
import java.util.*;
public class RemoveDuplicatesSet {

    public static void main(String[] args) {
        int [] nums = {1, 2, 2, 3, 4, 4, 4, 5, 5};

        removeDuplicates(nums);
    }
    public static void removeDuplicates(int[] nums){
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();

        // adding elements to the set
        for (int i = 0; i < nums.length; i++){
            set.add(nums[i]);
            System.out.println(set);
        }


    }
}
