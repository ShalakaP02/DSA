package LeetCode.Arrays;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{3,0,1}));
    }
    public static int missingNumber(int[] nums) {

//        Arrays.sort(nums);
//        int i;
//        for( i = 0; i < nums.length ; i++){
//            if(nums[i] != i){
//                return i;
//            }
//        }
//        return i;
        int n=nums.length;
        int totalsum=n*(n+1)/2; //sum of first n natural numbers
        for(int i:nums)
            totalsum= totalsum-i;
        return totalsum;
    }
}
