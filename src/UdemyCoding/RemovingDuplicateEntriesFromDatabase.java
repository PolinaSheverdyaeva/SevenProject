package UdemyCoding;

/*
Removing Duplicate Entries from Database.
As a startup, you have a database of customer information sorted in
non-decreasing order. However, there are duplicate entries that need
to be removed in-place such that each unique customer appears only once.
The relative order of the customers should be kept the same.
Write a function that takes in the database as an integer array and
returns the number of unique customers in the database after
removing duplicates.
 */


public class RemovingDuplicateEntriesFromDatabase {

    public static void main(String[] args) {
       int [] nums = {1, 2, 2, 3, 4, 4, 4, 5, 5};
       int uniqueCount = removeDuplicates(nums);

        System.out.println(uniqueCount);

        for(int i = 0; i < uniqueCount; i++){
            System.out.println(nums[i] + " ");
        }
    }

    public static Integer removeDuplicates(int[] nums) {
        //Using extra space
        //1. Create a temporary array temp[] to store unique elements.
        // 2.Traverse input array and copy all the unique elements of nums []
        // to temp[]. Also, keep count of unique elements. Let this count be index.
        // 3. Copy index elements from temp[] to nums[].

        if (nums == null || nums.length == 1) {
            return 0;
        }
        //creating another array for storing only unique elements
        int[] temp = new int[nums.length];
        int index = 0;
        //
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                temp[index++] = nums[i];
            }
        }
        // copy last element
            temp[index++] = nums[nums.length - 1];

            //Changing the original array
            for (int i = 0; i < index; i++) {
                nums[i] = temp[i];
            }
            return index;

    }





}
