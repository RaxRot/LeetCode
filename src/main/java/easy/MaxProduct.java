package easy;

import java.util.Arrays;

//Given the array of integers nums, you will choose two different indices i and j of that array.
// Return the maximum value of (nums[i]-1)*(nums[j]-1)
public class MaxProduct {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int firstMax = nums[nums.length - 1];
        int secondMax = nums[nums.length - 2];
        int result = (firstMax-1)*(secondMax-1);
        return result;
    }
}
