package UdemyCoding;



import java.util.*;

public class RemoveDuplicatesHashSet {

    public static void main(String[] args) {
        int[] nums= {1, 2, 2, 3, 4, 4, 4, 5, 5};
        int uniqueCount = removeDuplicates(nums);
        System.out.println(uniqueCount);

        for(int i = 0; i < uniqueCount; i++){
            System.out.println(nums[i] + " ");
        }
    }
    public static Integer removeDuplicates(int [] nums){

        LinkedHashSet<Integer> uniqueSet = new LinkedHashSet<>();
        int index = 0;

        for(int customer : nums){
            if(uniqueSet.add(customer)) {
                nums[index] = customer;
                index++;
            }
        }
        return index;
    }
}
