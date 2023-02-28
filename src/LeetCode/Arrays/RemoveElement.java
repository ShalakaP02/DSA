package LeetCode.Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class RemoveElement {
    public static void main(String[] args) {
        removeElementSimple(new int[]{0,1,2,2,3,0,4,2},2);
    }
    public static int removeElement(int[] nums, int val) {
        int len = nums.length;
        int count = 0;
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i = 0; i<nums.length;i++){
            hashMap.put(count++,nums[i]);
            if(hashMap.containsValue(val)){
                hashMap.remove(count-1);
                count--;
            }
            nums[i] = 0;
        }


        for(int i = 0; i< len; i++){
            if(null != hashMap.get(i)){
                nums[i] = hashMap.get(i);
                System.out.println(nums[i]);
            }
        }
        System.out.println("\n" +hashMap.size());
        return hashMap.size();
    }


    public static int removeElementSimple(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                System.out.println(nums[i]);

                i++;
            }
        }
       // System.out.println(i);
        return i;
    }

}
