package LeetCode.Arrays.easy;

import java.util.HashMap;

public class ContainsDuplicate2 {

    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicate(new int[]{1,2,3,1,2,3},2));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i = 0; i < nums.length ;i++) {
            if (!hmap.containsKey(nums[i])) {
                hmap.put(nums[i],i);
            }else{
               if(k  >= (i - hmap.get(nums[i]))){
                   return true;
                }else{
                   hmap.put(nums[i],i);
               }

            }
        }
        return false;

    }
}
