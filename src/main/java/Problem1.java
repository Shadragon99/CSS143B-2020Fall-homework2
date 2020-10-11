import java.io.*;

public class Problem1 {

    /*
    This method of sorting keeps three place holders a beginning, a middle, and a end. The beginning will keep 0's in place
    while middle keeps position for 1's and end will keep position for 2's. As the array is traversed, if the
    element is a 0 then swap the place with the element at beginning and increment beginning and middle. If the element
    is 1 then increment middle by 1. If the element is 2 then swap places with the element at the end var, then
    update end by -1.
     */

    // Do not change signature (function name, parameters type, and return type)

    //recieved help from geeksforgeeks.com on types of array sorting
    // (https://www.geeksforgeeks.org/sort-an-array-of-0s-1s-and-2s/)
    public static void colorSort(int[] nums) {

        int start = 0; //start var is the lower end to place any zeros down
        int end = nums.length -1; // end var is the higher end to place any twos in place
        int center = 0; // center places the ones in the middle
        int temp = 0; // allows for the switch between two elements to occur

        while (center <= end){
            switch(nums[center]){
                case 0: { // if nums[center] is 0 then use case 0
                    temp = nums[start]; // the temp variable allows for the start and center position to switch places
                    nums[start] = nums[center];
                    nums[center] = temp;
                    start ++;
                    center ++;
                    break;
                }
                case 1: { // if nums[center] is 1 then use case 1
                    center ++;
                    break;
                }
                case 2: { // if nums[center] is 2 then use case 2
                    temp = nums[center]; // temp allows for the center and end positions to switch places
                    nums[center] = nums[end];
                    nums[end] = temp;
                    end --;
                    break;
                }
            }
        }

    }
}
