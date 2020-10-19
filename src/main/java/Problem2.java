import java.util.Arrays;

public class Problem2 {

    /*
    Because the array in input as sorted, if there is a duplicate number it will be right next to the first number.
    If a duplicate is detected right next to if it will move the array from the right of the duplicate down to the
    beginning of the array by one. It will continue to do that until it reaches the largest number where it will instead
    break the loop. It will then read the array for the first largest number that will appear and take the length of the
    array from the first largest number and add one to the index of that element to find the length.
     */

    // Do not change signature (function name, parameters and return type)
    // Do not use extra space for another array. Solution to be in-pace with O(1) extra memory
    public static int remove(int[] nums) {

        int maxnum = nums[nums.length-1];
        int length = 0;
        for (int i = 0; i < nums.length -1; i++){
            while (nums[i] == nums[i+1]) {
                if (nums[i] == maxnum){
                    break;
                }
                for (int j = i + 1; j < nums.length-1; j++) {
                    nums[j] = nums[j + 1];

                }
            }
        }
        for (int l = 0; l < nums.length; l++){
            if (maxnum == nums[l]){
                length = l+1;
                break;
            }
        }


        return length;
    }
}
