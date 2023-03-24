package LeetCode.Arrays.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {

        int[] nums = new int[]{2,7,11,15};
        int[] arr = new int[2];
        arr = twoSum(nums,9);
        for (int i: arr) {
            System.out.println(i);
        }
        System.out.println();

    }
    public static int[] twoSum(int[] nums, int target) {

//        for (int i = 0; i < nums.length; i++){
//            for(int j = i+1 ; j < nums.length; j++){
//                if(nums[i]+nums[j]==target){
//                    return new int[] {i,j};
//                }
//
//            }
//        }
//
//        return new int[]{};

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        // In case there is no solution, we'll just return null
        return new int[]{};
    }


}
