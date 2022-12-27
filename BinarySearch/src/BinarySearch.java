public class BinarySearch {

    public int binarySearch ( int[] theArr, int target) {
        int high = theArr.length - 1;
        int low = 0;

        while (low <= high) {
            int mid = (high + low) / 2;
            if (target < theArr[mid]) {
                high = mid - 1;
            } else if (target > theArr[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }



    public static void main(String[] args) {
        /*Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

        You must write an algorithm with O(log n) runtime complexity.

        Example 1:
        Input: nums = [-1,0,3,5,9,12], target = 9
        Output: 4
        Explanation: 9 exists in nums and its index is 4

        Example 2:
        Input: nums = [-1,0,3,5,9,12], target = 2
        Output: -1
        Explanation: 2 does not exist in nums so return -1


        Constraints:

        1 <= nums.length <= 104
        -104 < nums[i], target < 104
        All the integers in nums are unique.
        nums is sorted in ascending order.
         */

        int[] list = {-1,0,3,5,9,12};

        BinarySearch obj = new BinarySearch();

        System.out.println(obj.binarySearch(list, 2));
    }
}