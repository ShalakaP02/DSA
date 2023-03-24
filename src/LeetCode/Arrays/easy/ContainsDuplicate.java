package LeetCode.Arrays.easy;

import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1,2,3,4}));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hset = new HashSet<>();
        for(int i = 0; i < nums.length; i++){

            if (!hset.add(nums[i])) {
                return true;
            }
            //hset.add(nums[i]);

        }
        return false;

//        if(nums.length != hset.size()){
//            return true;
//        }else{
//            return false;
//        }
    }
}

