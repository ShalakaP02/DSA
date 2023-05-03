package LeetCode.Arrays.easy;

import java.util.Arrays;

public class ThirdMaxNumber {
    public static void main(String[] args) {
        System.out.println(thirdMax(new int[]{2,1}));
    }
    public static int thirdMax(int[] nums) {
        long max = Long.MIN_VALUE, sMax = Long.MIN_VALUE, tMax = Long.MIN_VALUE;
        for (int i : nums) {
            if (i > max) {
                tMax = sMax;
                sMax = max;
                max = i;
            } else if (i > sMax && i != max) {
                tMax = sMax;
                sMax = i;
            } else if (i > tMax && i != sMax && i != max) {
                tMax = i;
            }
        }

        // if thirdMax was not updated, return the first Max
        return tMax == Long.MIN_VALUE ? (int) max : (int) tMax;


    }
}
