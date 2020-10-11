import java.util.Arrays;

public class Problem2 {

    /*
    Describe your algorithm here in up to 5 sentences:
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
