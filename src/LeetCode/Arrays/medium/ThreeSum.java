package LeetCode.Arrays.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1,0,1,0}));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> listOfList = new ArrayList<>();

        for(int i=0; i < nums.length-2 ; i++){
            for (int j= i + 1; j < nums.length - 1; j++){
                for (int k = j + 1 ; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> listOfThreeSums = new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k]));
                        Collections.sort(listOfThreeSums);
                        if (!listOfList.contains(listOfThreeSums)) {
                            listOfList.add(listOfThreeSums);
                        }

                    }
                }
            }

        }

        return listOfList;
    }
}
