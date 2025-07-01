package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//Given an array of integers nums and an integer target,
// return indices of the two numbers such that they add up to target.
public class TwoSum {

    public int[] twoSumFirstVersion(int[] nums, int target) {
       for (int i = 0; i < nums.length - 1; i++) {
           for (int j = i + 1; j < nums.length; j++) {
               if (nums[i] + nums[j] == target) {
                   return new int[]{i, j};
               }
           }
       }
        return new int[0];
    }

    public int[] twoSumSecondVersion(int[] nums, int target) {
       Map<Integer, Integer> map = new HashMap<>();
       for (int i = 0; i < nums.length; i++) {
           if (map.containsKey(target - nums[i])) {
               return new int[]{map.get(target - nums[i]), i};
           }
           map.put(nums[i], i);
       }
       return new int[0];
    }

    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int [] result1=ts.twoSumFirstVersion(nums, target);
        System.out.println(Arrays.toString(result1));
        int[] result2=ts.twoSumSecondVersion(nums, target);
        System.out.println(Arrays.toString(result2));
    }
}
