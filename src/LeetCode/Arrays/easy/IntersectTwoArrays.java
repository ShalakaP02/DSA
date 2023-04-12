package LeetCode.Arrays.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class IntersectTwoArrays {
    public static void main(String[] args) {
        int[] ary = intersection(new int[]{4,2,5,1}, new int[]{4,1});
        for (int i: ary) {
            System.out.println(i);
        }
        System.out.println();
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> res = new ArrayList<>();
        List<Integer> nums1List = Arrays.stream(nums1).boxed().collect(Collectors.toList());
        List<Integer> nums2List = Arrays.stream(nums2).boxed().collect(Collectors.toList());

        for (Integer i: nums2List) {
            if(nums1List.contains(i)){
                res.add(i);
            }

        }

        res = new ArrayList<>(new LinkedHashSet<>(res));
        int[] primitive = res.stream()
                .mapToInt(Integer::intValue)
                .toArray();


        return primitive;

    }
}
