package LeetCode.Arrays;

public class SingleNumber {
    public static void main(String[] args) {
       System.out.println(singleNumber(new int[]{2,3,4,5,3,2,4}));
    }
    public static int singleNumber(int[] nums) {
        int ans=0;
        for(int i=0; i<nums.length; i++){
            ans = ans^nums[i];
        }
        return ans;
    }
}
