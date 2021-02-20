import java.util.Arrays;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
*/

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        for (int counter1 = 0; counter1 < nums.length; counter1++) {
            for (int counter2 = counter1; counter2 < nums.length; counter2++) {
                if (target - nums[counter2] == nums[counter1]) {
                    result[0] = counter1;
                    result[1] = counter2;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 7, 5};
        int target = 8;
        Arrays.stream(twoSum(nums, target)).forEach(System.out::println);
    }
}
