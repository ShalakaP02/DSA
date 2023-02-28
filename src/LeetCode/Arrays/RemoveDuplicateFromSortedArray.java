package LeetCode.Arrays;

import java.util.*;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {

        removeDuplicates(new int[]{1, 1 , 2, 3, 3, 4});
    }
    public static int removeDuplicates(int[] nums) {

        int len = nums.length;
        int k = 0;
        HashMap<Integer,Integer> hmap = new HashMap<>();
        int count = 0;
        for(int i = 0; i<len ;i++){
            if(!hmap.containsValue(nums[i])){
                hmap.put(count++,nums[i]);
            }
            nums[i] = 0;
        }
        for(int i = 0; i< len; i++){
            if(null != hmap.get(i)){
                nums[i] = hmap.get(i);
            }

        }

        return hmap.size();

    }

}
