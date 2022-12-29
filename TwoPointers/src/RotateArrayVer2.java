import java.util.Arrays;

//this is the slower version (easy to understand though)
public class RotateArrayVer2 {
    public static void rotate (int nums[], int k){
        int [] result = new int [nums.length];
        for(int i = 0; i<nums.length; i++){
            int index = (i+k)%nums.length;
            result[index] = nums[i];
        }

        for(int j = 0; j<nums.length; j++){
            nums[j] = result[j];
        }

        System.out.println(Arrays.toString(nums));
    }
    public static void main (String[] args){
        /*
        Given an array, rotate the array to the right by k steps, where k is non-negative.

        Example 1:
        Input: nums = [1,2,3,4,5,6,7], k = 3
        Output: [5,6,7,1,2,3,4]
        Explanation:
        rotate 1 steps to the right: [7,1,2,3,4,5,6]
        rotate 2 steps to the right: [6,7,1,2,3,4,5]
        rotate 3 steps to the right: [5,6,7,1,2,3,4]

        Example 2:
        Input: nums = [-1,-100,3,99], k = 2
        Output: [3,99,-1,-100]
        Explanation:
        rotate 1 steps to the right: [99,-1,-100,3]
        rotate 2 steps to the right: [3,99,-1,-100]
         */
        int [] test1 = {1,2,3,4,5,6,7};
        int num1 = 3;

        int [] test2 = {-1,-100,3,99};
        int num2 = 2;

        rotate(test1, num1);
        rotate(test2, num2);
    }
}
